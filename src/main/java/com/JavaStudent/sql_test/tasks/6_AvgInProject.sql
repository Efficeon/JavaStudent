USE DevelopmentDB;

SELECT NAME, COST, avg(SALARY)
FROM developers CROSS JOIN project_developers, projects
WHERE developers.ID = developer_id AND projects.ID = project_id GROUP BY NAME Order by COST LIMIT 1;
