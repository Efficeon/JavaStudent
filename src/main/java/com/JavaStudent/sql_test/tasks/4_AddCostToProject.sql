USE DevelopmentDB;

ALTER TABLE projects ADD COST INT;

UPDATE projects SET COST = 100000 WHERE teamID = '1';
UPDATE projects SET COST = 15000 WHERE teamID = '2';
UPDATE projects SET COST = 70000 WHERE teamID = '3';
UPDATE projects SET COST = 200000 WHERE teamID = '4';
UPDATE projects SET COST = 40000 WHERE teamID = '5';
UPDATE projects SET COST = 700000 WHERE teamID = '6';
UPDATE projects SET COST = 150000 WHERE teamID = '7';
UPDATE projects SET COST = 200000 WHERE teamID = '8';
UPDATE projects SET COST = 20000 WHERE teamID = '9';
UPDATE projects SET COST = 1000000 WHERE teamID = '10';

SELECT * FROM projects;
