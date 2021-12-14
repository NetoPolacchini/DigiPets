CREATE DATABASE Digipets;
USE Digipets;

create table animal(
	nome_animal varchar(45),
	cod_animal int,
    raca_animal varchar(45),
    sexo_animal varchar(45),
    primary key (cod_animal),
    constraint fk_cpf_tutor foreign key (cpf_tutor) references tutor (cpf_tutor),
    constraint fk_cpf_vet foreign key (cpf_vet) references veterianrio (cpf_vet)
);

create table vacina(
	nome_vacina varchar(45),
	cod_vacina int,
	validade_vacina date,
    primary key (cod_vacina),
    constraint fk_cpf_vet foreign key (cpf_vet) references veterinario (cpf_vet) 
);

create table veterinario(
	nome_vet varchar(45),
    crmv_vet varchar(45),
	cpf_vet varchar(45),
	senha_vet varchar(45),
	tipo_usuario varchar(45),
    primary key (cpf_vet)
);

create table tutor(
	nome_tutor varchar(45),
	cpf_tutor varchar(45),
	senha_tutor varchar(45),
	tipo_usuario varchar(45),
    primary key (cpf_tutor),
    constraint fk_cpf_vet foreign key (cpf_vet) references veterianrio (cpf_vet)    
);

CREATE TABLE carteira(
  nome_animal varchar(45),
  nome_vacina varchar(45),
  cod_carteira int,
  primary key (cod_carteira),
  constraint fk_cpf_vet foreign key (cpf_vet) references veterianrio (cpf_vet)
);