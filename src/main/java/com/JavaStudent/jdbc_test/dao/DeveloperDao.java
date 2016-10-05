package com.JavaStudent.jdbc_test.dao;

import com.JavaStudent.jdbc_test.view.ConsoleHelper;
import com.JavaStudent.jdbc_test.model.Developer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeveloperDao{
    private List<Developer> listDevelopers = null;
    private ResultSet resultSetDevelopers;

    protected List<Developer> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM developers";
        resultProcessing(sql);
        return listDevelopers;
    }

    protected List<Developer> readingTeamsElements(int teamID) throws SQLException {
        String sql = "SELECT * FROM developers WHERE teamID = " + teamID;
        resultProcessing(sql);
        return listDevelopers;
    }

    protected List<Developer> readingElement(int developerID) throws SQLException {
        String sql = "SELECT * FROM developers WHERE developerID = " + developerID;
        resultProcessing(sql);
        return listDevelopers;
    }

    public void updateElement(int developerID, int teamID) throws SQLException {
        String sql = "UPDATE developers SET teamID = ? WHERE developerID =?";
        ConnectDao.changeRecord(sql, teamID, developerID);
    }

    public void deleteElement(int developerID) throws SQLException {
        String sql = "DELETE FROM developers WHERE developerID = ?";
        ConnectDao.changeRecord(sql, developerID);
    }

    public void createElement(int developerID, String name, int teamID) throws SQLException {
        Developer developer = new Developer(developerID, name, teamID);
        String sql = "INSERT INTO developers VALUES(?, ?, ?)";
        ConnectDao.addRecord(sql, name, developerID, teamID);
    }

    public void showAllDevelopers() throws SQLException {
        readingAllElements();
        for (Developer developer :listDevelopers){
            ConsoleHelper.writeMessage(developer.toString());
        }
    }

    public void showDeveloper(int developerID) throws SQLException {
        readingElement(developerID);
        for (Developer developer :listDevelopers){
            ConsoleHelper.writeMessage(developer.toString());
        }
    }

    /*public void showTeamsDevelopers(int teamID) throws SQLException {
        readingTeamsElements(teamID);
        for (Developer developer :listDevelopers){
            ConsoleHelper.writeMessage(developer.toString());
        }
    }*/

    private void resultProcessing(String sql) throws SQLException {
        resultSetDevelopers = ConnectDao.selectRecord(sql);
        listDevelopers = new ArrayList<>();
        while (resultSetDevelopers.next()){
            int developerID = resultSetDevelopers.getInt("developerID");
            String name = resultSetDevelopers.getString("name");
            int teamID = resultSetDevelopers.getInt("teamID");
            listDevelopers.add(new Developer(developerID, name, teamID));
        }
        resultSetDevelopers.close();
    }
}
