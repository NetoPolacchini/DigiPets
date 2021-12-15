DROP DATABASE IF EXISTS DigiPetsNew;
CREATE DATABASE DigiPetsNew;
USE DigiPetsNew;

CREATE TABLE usuario (
	idUsuario INT AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL,
    cpf VARCHAR(45) NOT NULL,
    senha VARCHAR(11) NOT NULL,
    crm VARCHAR(20),
    tipoUsuario INT,
    PRIMARY KEY (idUsuario)
);

CREATE TABLE animal (
	idAnimal INT AUTO_INCREMENT,
    nome VARCHAR(45),
    raca VARCHAR(45),
    sexo VARCHAR(10),
    especie VARCHAR(30),
    obsGerais VARCHAR(300),
    PRIMARY KEY (idAnimal)
);

CREATE TABLE carteira(
	idCarteiraAnimal INT,
	nomeVacina VARCHAR(45),
    dataAplicVacina DATE,
    nomeAnimal VARCHAR(45),
    PRIMARY KEY (idCarteiraAnimal)
);


INSERT INTO usuario (nome, cpf, senha, tipoUsuario) VALUES ("Fonsseca", "123", "pau", 1);

SELECT * FROM usuario;