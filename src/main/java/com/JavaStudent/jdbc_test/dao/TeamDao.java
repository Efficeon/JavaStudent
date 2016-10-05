package com.JavaStudent.jdbc_test.dao;

import com.JavaStudent.jdbc_test.view.ConsoleHelper;
import com.JavaStudent.jdbc_test.model.Developer;
import com.JavaStudent.jdbc_test.model.Team;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDao{
    private List<Developer> listDevelopers = null;
    private List<Team> listTeams = null;
    private ResultSet resultSetTeams;

    public List<Team> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM teams";
        resultProcessing(sql);
        return listTeams;
    }

    public List<Team> readingTeamsElements(int teamID) throws SQLException {
        String sql = "SELECT * FROM teams WHERE teamID = " + teamID;
        resultProcessing(sql);
        return listTeams;
    }

    public List<Team> readingProjectsElements(int projectID) throws SQLException {
        String sql = "SELECT * FROM teams WHERE projectID = " + projectID;
        resultProcessing(sql);
        return listTeams;
    }

    public void updateElement(int teamID, String name) throws SQLException {
        String sql = "UPDATE teams SET name = ? WHERE teamID = ?";
        ConnectDao.changeRecord(teamID, sql, name);
    }

    public void deleteElement(int teamID) throws SQLException {
        String sql = "DELETE FROM teams WHERE teamID = ?";
        ConnectDao.changeRecord(sql, teamID);
    }

    public void createElement(int teamID, String name, int projectID) throws SQLException {
        Team team = new Team(teamID, name, projectID);
        String sql = "INSERT INTO teams VALUES(?, ?, ?)";
        ConnectDao.addRecord(sql, name, teamID, projectID);
    }

    public void showAllTeams() throws SQLException {
        readingAllElements();
        for (Team team : listTeams){
            ConsoleHelper.writeMessage(team.toString());
        }
    }

    public void showTeam(int teamID) throws SQLException {
        readingTeamsElements(teamID);
        for (Team team : listTeams){
            ConsoleHelper.writeMessage(team.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetTeams = ConnectDao.selectRecord(sql);
        listTeams = new ArrayList<>();

        while (resultSetTeams.next()){
            int teamID = resultSetTeams.getInt("teamID");
            String name = resultSetTeams.getString("name");
            int projectID = resultSetTeams.getInt("projectID");
            Team team = new Team(teamID, name, projectID);
            listTeams.add(team);
        }
        resultSetTeams.close();

        DeveloperDao developerDao = new DeveloperDao();
        for (Team team : listTeams){
            listDevelopers = developerDao.readingTeamsElements(team.getTeamID());
            team.setTeamOfDeveloper(listDevelopers);
        }
    }
}
