DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;

USE my_db;

DROP TABLE IF EXISTS account;

CREATE TABLE if not exists account
(
    id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    name varchar(50) NOT NULL,
    amount   double      NOT NULL
);

SHOW TABLES;

select * from account;