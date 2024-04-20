DROP DATABASE IF EXISTS locadora; -- Apagar o bd caso esistir
CREATE DATABASE locadora; -- criar o bd
USE locadora; -- Apontar para o bd

CREATE TABLE categorias (
    id int AUTO_INCREMENT NOT NULL,
    nome VARCHAR (100),
    PRIMARY KEY (id)
);
CREATE TABLE filmes (
    id int AUTO_INCREMENT NOT NULL,
id_categoria INT NOT NULL, 
    nome VARCHAR (100),

-- criando uma chave estrangeiras(referencia com outra tabela)
    foreign key(id_categoria) REFERENCES categorias(id),
    PRIMARY KEY (id)
);

INSERT INTO categorias (nome) VALUES
("Terror"),
("Ação"),
("Romance"),
("Comédia"),
("Drama"),
("Ficção cientifica");

INSERT INTO filmes  (id_categoria, nome) VALUES
(1, "IT a coisa"),
(6, "Interestelar");