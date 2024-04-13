DROP DATABASE IF EXISTS locadora; -- Apagar o bd caso esistir
CREATE DATABASE locadora; -- criar o bd
USE locadora; -- Apontar para o bd
CREATE TABLE filmes (
    id int AUTO_INCREMENT NOT NULL,
    nome VARCHAR (100),
    PRIMARY KEY (id)
);