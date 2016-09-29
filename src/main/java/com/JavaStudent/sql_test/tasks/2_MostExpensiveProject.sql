USE DevelopmentDB;

SELECT NAME, sum(SALARY)
FROM developers CROSS JOIN project_developers, projects
WHERE developers.ID = developer_id AND projects.ID = project_id
GROUP BY NAME Order by sum(salary) DESC LIMIT 1;