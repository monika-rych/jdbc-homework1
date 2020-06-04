CREATE SCHEMA IF NOT EXISTS PUBLIC;

CREATE TABLE IF NOT EXISTS OWNERS
(
    ID            int AUTO_INCREMENT PRIMARY KEY,
    "NAME"        varchar(50),
    STREET        VARCHAR(100),
    CITY          VARCHAR(100),
    POSTAL_CODE   VARCHAR(50),
    GENDER        varchar(50),
    DOG_ID        int
);

CREATE TABLE IF NOT EXISTS DOG
(
    ID      INT auto_increment,
    "NAME"  VARCHAR(50) not null,
    BREED   VARCHAR(50)
);