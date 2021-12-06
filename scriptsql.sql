drop database if exists Digipets;
CREATE DATABASE Digipets;
USE Digipets;

create table animal(
	nomeAnimal varchar(45),
	codAnimal int,
	dataNascimentoAnimal varchar(45),
	sexoAnimal varchar(45),
	especieAnimal varchar(45),
	racaAnimal varchar(45),
	pesoAnimal float,
	obsGerais varchar(45),
    codTutor int
);

create table vacina(
	nomeVacina varchar(45),
	codVacina int,
	dataAplicVacina varchar(45),
	loteVacina varchar(45),
	dataFabVacina varchar(45)
);

create table veterinario(
	nomeVet varchar(45),
	emailVet varchar(45),
	telefoneVet varchar(45),
	crmvVet varchar(45),
	cpfUsuario varchar(45),
	senhaUsuario varchar(45),
	tipoUsuario varchar(45)
);

create table tutor(
	nomeTutor varchar(45),
	codTutor int,
	emailTutor varchar(45),
	telefoneTutor varchar(45),
	enderecoTutor varchar(45),
	cpfUsuario varchar(45),
	senhaUsuario varchar(45),
	tipoUsuario varchar(45)
);

CREATE TABLE carteira(
  codAnimal INT,
  nomeAnimal VARCHAR(45),
  dataNascianimal VARCHAR(45),
  sexoAnimal VARCHAR(45),
  racaAnimal VARCHAR(45),
  pesoAnimal FLOAT,
  obsGerais VARCHAR(45),
  nomeVacina VARCHAR(45),
  codVacina VARCHAR(45),
  Carteiracol INT,
  dataAplicVacina VARCHAR(45),
  loteAplicVacina VARCHAR(45),
  dataFebVacina VARCHAR(45),
  tutor_codTutor INT,
  veterianrio_cpfVet VARCHAR(45)
  );
