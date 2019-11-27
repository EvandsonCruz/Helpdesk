create database Helpdesk
use Helpdesk
go

create table Administrador(
idAdministrador int identity not null,
login varchar(100) not null,
senha varchar(100) not null,
privilegio varchar(15) not null,
primary key(idAdministrador))

insert into Administrador values (1,'admin','admin','Administrador')

select * from Administrador

create table Chamado(
idChamado int not null,
idade date not null,
assunto varchar(255) not null,
estado varchar(10) not null,
disponibilidade varchar(15) not null,
fila char(5) not null,
atendimento varchar(15) null,
cliente varchar (100) not null,
resposta varchar(255) null,
primary key (idChamado))

insert into Chamado values
(0001,'2019-11-26',	'Pc não liga','Aberto',	'Desbloqueado',	'Fila2',	'Evandson',	'Zezinho'),
(0002,	'2019-11-26',	'Criar email',	'Aberto',	'Desbloqueado',	'Fila2',	'Evandson',	'Luizinho'),
(0003,	'2019-11-26',	'Alterar Servidor',	'Aberto',	'Bloqueado',	'Fila3',	'Evandson', 'Mariazinha')

select * from Chamado