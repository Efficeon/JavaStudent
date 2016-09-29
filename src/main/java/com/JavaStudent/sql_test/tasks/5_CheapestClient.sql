USE DevelopmentDB;

SELECT companies.NAME, projects.NAME, min(projects.COST), customers.NAME
FROM companies CROSS JOIN company_projects_customers, projects, customers
WHERE companies.ID = company_id AND projects.ID = project_id  AND customers.ID = customer_id GROUP BY companies.NAME;
