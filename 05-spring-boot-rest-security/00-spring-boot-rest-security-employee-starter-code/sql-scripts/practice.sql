CREATE DATABASE IF NOT EXISTS `practice`;
USE `practice`;

DROP TABLE IF EXISTS `Works`;
DROP TABLE IF EXISTS `Employee1`;
DROP TABLE IF EXISTS `Company`;

-- Create the Employee1 table
CREATE TABLE Employee1 (
    Person_name VARCHAR(50) PRIMARY KEY,
    Street VARCHAR(100),
    City VARCHAR(50),
    joining DATE
);

-- Create the Company table
CREATE TABLE Company (
    Company_name VARCHAR(50) PRIMARY KEY,
    City VARCHAR(50)
);

-- Create the Works table
CREATE TABLE Works (
    Person_name VARCHAR(50),
    Company_name VARCHAR(50),
    Salary DECIMAL(10, 2),
    PRIMARY KEY (Person_name, Company_name),
    FOREIGN KEY (Person_name) REFERENCES Employee1(Person_name),
    FOREIGN KEY (Company_name) REFERENCES Company(Company_name)
);

-- Insert values into the Employee1 table
INSERT INTO Employee1 (Person_name, Street, City, joining)
VALUES
('John Doe', '123 MG Road', 'Pune', '2004-05-01'),
('Jane Smith', '456 MG Road', 'Mumbai', '2005-05-05'),
('Alice Johnson', '789 FC Road', 'Pune', '2006-04-07'),
('Bob Brown', '101 DP Road', 'Bangalore', '2008-07-08');

-- Insert values into the Company table
INSERT INTO Company (Company_name, City)
VALUES
('Yes Bank', 'Mumbai'),
('Infosys', 'Bangalore'),
('Tata Motors', 'Pune');

-- Insert values into the Works table
INSERT INTO Works (Person_name, Company_name, Salary)
VALUES
('John Doe', 'Yes Bank', 60000),
('Jane Smith', 'Infosys', 75000),
('Alice Johnson', 'Tata Motors', 68000),
('Bob Brown', 'Yes Bank', 55000);

-- Update the Salary in the Works table based on the joining date in the Employee1 table
-- UPDATE Works w
-- JOIN Employee1 e ON w.Person_name = e.Person_name
-- SET w.Salary = 0.2 * w.Salary
-- WHERE e.joining > '2004-05-01';

-- Select sum(Salary) from works;
-- select person_name From Employee1 where max(salary);
