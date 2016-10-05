USE DevelopmentDB;

SELECT NAME, COST, avg(SALARY)
FROM developers INNER JOIN project_developers, projects
WHERE developers.teamID = developer_id AND projects.teamID = project_id GROUP BY NAME Order by COST LIMIT 1;
