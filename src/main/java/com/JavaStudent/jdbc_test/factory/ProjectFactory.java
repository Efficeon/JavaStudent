package com.JavaStudent.jdbc_test.factory;

import com.JavaStudent.jdbc_test.dao.ProjectDao;

import java.sql.SQLException;

public class ProjectFactory {
    public void createProject(int projectID, String name) throws SQLException {
        ProjectDao projectDao = new ProjectDao();
        projectDao.createElement(projectID, name);
    }
}
