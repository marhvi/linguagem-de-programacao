
create database if not exists loja;
use loja;

create table produto (
    id int primary key auto_increment,
    nome varchar (150) not null,
    marca varchar (150) not null,
    preco double(9,2) not null unique,
    tipo varchar (150) not null
);
