package com.JavaStudent.jdbc_test.factory;

import com.JavaStudent.jdbc_test.dao.DeveloperDao;

import java.sql.SQLException;

public class DeveloperFactory{

    public void createDeveloper(int developerID, String name, int teamID) throws SQLException {
        DeveloperDao developerDao = new DeveloperDao();
        developerDao.createElement(developerID, name, teamID);
    }
}
