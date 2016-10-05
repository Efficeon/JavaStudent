USE DevelopmentDB;

ALTER TABLE developers ADD SALARY INT;

UPDATE developers SET SALARY = 2700 WHERE teamID = '1';
UPDATE developers SET SALARY = 2000 WHERE teamID = '2';
UPDATE developers SET SALARY = 2100 WHERE teamID = '3';
UPDATE developers SET SALARY = 1000 WHERE teamID = '4';
UPDATE developers SET SALARY = 1700 WHERE teamID = '5';
UPDATE developers SET SALARY = 3000 WHERE teamID = '6';
UPDATE developers SET SALARY = 2770 WHERE teamID = '7';
UPDATE developers SET SALARY = 2350 WHERE teamID = '8';
UPDATE developers SET SALARY = 1900 WHERE teamID = '9';
UPDATE developers SET SALARY = 2000 WHERE teamID = '10';

