CREATE DATABASE Digipets;
USE Digipets;

create table animal(
	nome_animal varchar(45),
	cod_animal int,
    especie_animal varchar(45),
    primary key (cod_animal)
);

create table vacina(
	nome_vacina varchar(45),
	cod_vacina int,
	data_aplic_vacina date,
    primary key (cod_vacina)
);

create table veterinario(
	nome_vet varchar(45),
	cpf_usuario varchar(45),
	senha_usuario varchar(45),
	tipo_usuario varchar(45),
    primary key (cpf_usario)
);

create table tutor(
	nome_tutor varchar(45),
	cpf_usuario varchar(45),
	senha_usuario varchar(45),
	tipo_usuario varchar(45),
    primary key (cpf_usuario)
);

CREATE TABLE carteira(
  nome_animal varchar(45),
  nome_vacina varchar(45),
  data_aplic_vacina date,
  nome_tutor varchar(45),
  nome_vet varchar(45),
  primary key (nome_animal)
);
  

