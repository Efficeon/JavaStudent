package com.JavaStudent.jdbc_test.dao;

import com.JavaStudent.jdbc_test.view.ConsoleHelper;
import com.JavaStudent.jdbc_test.model.Project;
import com.JavaStudent.jdbc_test.model.Team;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDao{
    private List<Project> listProjects = null;
    private List<Team> listTeams = null;
    private ResultSet resultSetProjects;

    public List<Project> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM projects";
        resultProcessing(sql);
        return listProjects;
    }

    public List<Project> readingProjectsElements(int projectID) throws SQLException {
        String sql = "SELECT * FROM projects WHERE projectID = " + projectID;
        resultProcessing(sql);
        return listProjects;
    }

    public void updateElement(int projectID, String name) throws SQLException {
        String sql = "UPDATE projects SET name = ? WHERE projectID = ?";
        ConnectDao.changeRecord(projectID, sql, name);
    }

    public void deleteElement(int projectID) throws SQLException {
        String sql = "DELETE FROM projects WHERE projectID = ?";
        ConnectDao.changeRecord(sql, projectID);
    }

    public void showAllProjects() throws SQLException {
        readingAllElements();
        for (Project project : listProjects){
            ConsoleHelper.writeMessage(project.toString());
        }
    }

    public void showProject(int projectID) throws SQLException {
        readingProjectsElements(projectID);
        for (Project project : listProjects){
            ConsoleHelper.writeMessage(project.toString());
        }
    }

    public void createElement(int projectID, String name) throws SQLException {
        Project project = new Project(projectID, name);
        String sql = "INSERT INTO projects VALUES(?, ?)";
        ConnectDao.addRecord(sql, name, projectID);
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetProjects = ConnectDao.selectRecord(sql);
        listProjects = new ArrayList<>();

        while (resultSetProjects.next()){
            int projectID = resultSetProjects.getInt("projectID");
            String name = resultSetProjects.getString("name");
            Project project = new Project(projectID, name);
            listProjects.add(project);
        }
        resultSetProjects.close();

        TeamDao teamDao = new TeamDao();
        for (Project project : listProjects){
            listTeams = teamDao.readingProjectsElements(project.getProjectID());
            project.setTeams(listTeams);
        }
    }
}
