CREATE DATABASE booklibrary;

USE booklibrary;

CREATE TABLE book (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(200) NULL,
  rating INT NULL,
  PRIMARY KEY (id)
);
