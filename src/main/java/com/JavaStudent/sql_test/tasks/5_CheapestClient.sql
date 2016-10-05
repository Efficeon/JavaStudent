USE DevelopmentDB;

SELECT companies.NAME, projects.NAME, min(projects.COST), customers.NAME
FROM companies INNER JOIN company_projects_customers, projects, customers
WHERE companies.teamID = company_id AND projects.teamID = project_id  AND customers.teamID = customer_id GROUP BY companies.NAME;
