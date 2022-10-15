DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;

USE my_db;

DROP TABLE IF EXISTS purchase;

CREATE TABLE if not exists purchase
(
    id      INT AUTO_INCREMENT PRIMARY KEY ,
    product varchar(50) NOT NULL,
    price   double      NOT NULL
);

SHOW TABLES;

select * from purchase;