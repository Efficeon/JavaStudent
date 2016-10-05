-- SET CHARACTER SET utf8;
CREATE DATABASE DevelopmentDB;
USE DevelopmentDB;

/*-------------------------------------------------------------------*/

CREATE TABLE developers(
  teamID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  FIRSTNAME VARCHAR(100) NOT NULL ,
  LASTNAME VARCHAR(100) NOT NULL ,
  AGE INT NOT NULL ,
  SALARY INT NOT NULL
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE skills(
  teamID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE projects(
  teamID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE companies(
  teamID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE customers(
  teamID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;

/*-------------------------------------------------------------------*/

CREATE TABLE developer_skills (
  developer_id INT NOT NULL ,
  skill_id INT NOT NULL ,

  FOREIGN KEY (developer_id) REFERENCES developers (teamID),
  FOREIGN KEY (skill_id) REFERENCES skills (teamID),

  UNIQUE (developer_id, skill_id)
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE project_developers (
  project_id INT NOT NULL ,
  developer_id INT NOT NULL ,

  FOREIGN KEY (project_id) REFERENCES projects (teamID),
  FOREIGN KEY (developer_id) REFERENCES developers (teamID),

  UNIQUE (project_id, developer_id)
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

CREATE TABLE company_projects_customers (
  company_id INT NOT NULL ,
  project_id INT NOT NULL ,
  customer_id INT NOT NULL ,

  FOREIGN KEY (company_id) REFERENCES companies (teamID),
  FOREIGN KEY (project_id) REFERENCES projects (teamID),
  FOREIGN KEY (customer_id) REFERENCES customers (teamID),

  UNIQUE (company_id, project_id, customer_id)
)
  ENGINE = InnoDB;
/*-------------------------------------------------------------------*/

INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (1, 'Leonid ', 'Dubravsky', 33, 4000);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (2, 'Maria', 'Krevetochkina', 25, 2700);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (3, 'Makar', 'Drozd', 28, 2800);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (4, 'Trofim', 'Ulitka', 30, 3200);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (5, 'Alla', 'Pokrishkina', 37, 3500);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (6, 'Lada', 'Zhiguleva', 24, 2000);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (7, 'Igor', 'Chorniy', 26, 5000);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (8, 'Tamara', 'Gorina', 23, 2000);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (9, 'Alina', 'Pokohontas', 25, 5500);
INSERT INTO developers(teamID, FIRSTNAME, LASTNAME, AGE, SALARY)
VALUES (10, 'Karina', 'Frost', 24, 2300);
/*-------------------------------------------------------------------*/

INSERT INTO skills(teamID, NAME)
VALUES (1, 'JAVA');
INSERT INTO skills(teamID, NAME)
VALUES (2, 'PHP');
INSERT INTO skills(teamID, NAME)
VALUES (3, 'SQL');
INSERT INTO skills(teamID, NAME)
VALUES (4, 'C#');
INSERT INTO skills(teamID, NAME)
VALUES (5, 'JavaScript');
INSERT INTO skills(teamID, NAME)
VALUES (6, 'C++');
INSERT INTO skills(teamID, NAME)
VALUES (7, 'Spring');
INSERT INTO skills(teamID, NAME)
VALUES (8, 'HTML');
INSERT INTO skills(teamID, NAME)
VALUES (9, 'Maven');
INSERT INTO skills(teamID, NAME)
VALUES (10, 'FrameWorks');
/*-------------------------------------------------------------------*/

INSERT INTO projects(teamID, NAME)
VALUES (1, 'Development of client-bank system');
INSERT INTO projects(teamID, NAME)
VALUES (2, 'Development of Web Site for company');
INSERT INTO projects(teamID, NAME)
VALUES (3, 'Maintenance of trade system');
INSERT INTO projects(teamID, NAME)
VALUES (4, 'Update CRM');
INSERT INTO projects(teamID, NAME)
VALUES (5, 'Rework of BPM-online');
INSERT INTO projects(teamID, NAME)
VALUES (6, 'Rework of FlexCube system');
INSERT INTO projects(teamID, NAME)
VALUES (7, 'Integration DLP System');
INSERT INTO projects(teamID, NAME)
VALUES (8, 'Development of Accounting system');
INSERT INTO projects(teamID, NAME)
VALUES (9, 'Support Call center system');
INSERT INTO projects(teamID, NAME)
VALUES (10, 'Integration of Billing system');
/*-------------------------------------------------------------------*/

INSERT INTO customers(teamID, NAME)
VALUES (1, 'Trade Group LLC');
INSERT INTO customers(teamID, NAME)
VALUES (2, 'Contact Bank');
INSERT INTO customers(teamID, NAME)
VALUES (3, 'Shop "Galatradion"');
INSERT INTO customers(teamID, NAME)
VALUES (4, 'Luxor LLC');
INSERT INTO customers(teamID, NAME)
VALUES (5, 'Morgan Company');
INSERT INTO customers(teamID, NAME)
VALUES (6, 'Limit Trade LLC');
INSERT INTO customers(teamID, NAME)
VALUES (7, 'Compass Bank');
INSERT INTO customers(teamID, NAME)
VALUES (8, 'Shop "Niva"');
INSERT INTO customers(teamID, NAME)
VALUES (9, 'Gogo LLC');
INSERT INTO customers(teamID, NAME)
VALUES (10, 'Sparkling vine Group');
/*-------------------------------------------------------------------*/

INSERT INTO companies(teamID, NAME)
VALUES (1, 'Epam');
INSERT INTO companies(teamID, NAME)
VALUES (2, 'DATAS TECHNOLOGY');
INSERT INTO companies(teamID, NAME)
VALUES (3, 'NCube LTD');
INSERT INTO companies(teamID, NAME)
VALUES (4, 'Artel Outsourcing Group');
INSERT INTO companies(teamID, NAME)
VALUES (5, 'Scalibre');
/*-------------------------------------------------------------------*/

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (1, 1);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (1, 3);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (1, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (1, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (1, 9);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (2, 2);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (2, 3);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (2, 4);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (2, 5);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (3, 1);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (3, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (3, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (3, 9);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (4, 5);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (4, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (4, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (4, 9);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (5, 4);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (5, 3);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (5, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (5, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (5, 9);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (6, 2);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (6, 5);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (6, 8);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 1);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 6);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 4);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 3);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 9);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (7, 10);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (8, 4);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (8, 5);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (8, 10);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 1);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 2);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 7);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 8);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 9);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (9, 10);

INSERT INTO developer_skills(developer_id, skill_id)
VALUES (10, 5);
INSERT INTO developer_skills(developer_id, skill_id)
VALUES (10, 8);
/*-------------------------------------------------------------------*/

INSERT INTO project_developers(project_id, developer_id)
VALUES (1, 9);
INSERT INTO project_developers(project_id, developer_id)
VALUES (1, 2);
INSERT INTO project_developers(project_id, developer_id)
VALUES (1, 4);
INSERT INTO project_developers(project_id, developer_id)
VALUES (1, 7);

INSERT INTO project_developers(project_id, developer_id)
VALUES (2, 3);
INSERT INTO project_developers(project_id, developer_id)
VALUES (2, 5);

INSERT INTO project_developers(project_id, developer_id)
VALUES (3, 2);
INSERT INTO project_developers(project_id, developer_id)
VALUES (3, 3);
INSERT INTO project_developers(project_id, developer_id)
VALUES (3, 4);

INSERT INTO project_developers(project_id, developer_id)
VALUES (4, 6);
INSERT INTO project_developers(project_id, developer_id)
VALUES (4, 8);
INSERT INTO project_developers(project_id, developer_id)
VALUES (4, 10);
INSERT INTO project_developers(project_id, developer_id)
VALUES (4, 5);

INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 6);
INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 8);
INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 1);
INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 7);
INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 10);
INSERT INTO project_developers(project_id, developer_id)
VALUES (5, 9);

INSERT INTO project_developers(project_id, developer_id)
VALUES (6, 8);
INSERT INTO project_developers(project_id, developer_id)
VALUES (6, 1);
INSERT INTO project_developers(project_id, developer_id)
VALUES (6, 2);
INSERT INTO project_developers(project_id, developer_id)
VALUES (6, 10);
INSERT INTO project_developers(project_id, developer_id)
VALUES (6, 9);

INSERT INTO project_developers(project_id, developer_id)
VALUES (7, 1);
INSERT INTO project_developers(project_id, developer_id)
VALUES (7, 3);

INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 1);
INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 4);
INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 5);
INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 6);
INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 7);
INSERT INTO project_developers(project_id, developer_id)
VALUES (8, 9);

INSERT INTO project_developers(project_id, developer_id)
VALUES (9, 7);
INSERT INTO project_developers(project_id, developer_id)
VALUES (9, 5);

INSERT INTO project_developers(project_id, developer_id)
VALUES (10, 1);
INSERT INTO project_developers(project_id, developer_id)
VALUES (10, 5);
INSERT INTO project_developers(project_id, developer_id)
VALUES (10,4);
/*-------------------------------------------------------------------*/

INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (1, 10, 2);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (1, 8, 1);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (1, 7, 4);

INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (2, 5, 3);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (2, 6, 5);

INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (3, 3, 1);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (3, 4, 5);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (3, 5, 2);

INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (4, 1, 1);
INSERT INTO company_projects_customers(company_id, project_id, customer_id)
VALUES (4, 2, 4);
/*-------------------------------------------------------------------*/

