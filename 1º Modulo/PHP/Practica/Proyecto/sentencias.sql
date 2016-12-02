CREATE database CCOO;

use CCOO;

CREATE TABLE SolicitudesDelegados(id int auto_increment,nombre varchar(25),apellidos varchar(50),telefono char(9),email varchar(254),razon text,
CONSTRAINT PK_SolicitudesDelegados PRIMARY KEY SolicitudesDelegados(id));

CREATE TABLE Noticias(id int auto_increment,titulo varchar(240),subtitulo text,cuerpo text,imagen varchar(250),pieImagen varchar(150),imagenMiniatura varchar(250),
fechaCreacion date,fechaModificacion datetime,
CONSTRAINT PK_Noticias PRIMARY KEY Noticias(id));

CREATE TABLE Documentacion(id int auto_increment,titulo varchar(250),descripcion varchar(254),fechaPublicacion date,archivo varchar(250),privado boolean,ley boolean,
fechaModificacion datetime,
CONSTRAINT PK_Documentacion PRIMARY KEY Documentacion(id));

CREATE TABLE Delegados(id int auto_increment,usuario varchar(25),password varchar(16),nombre varchar(25),apellidos varchar(50),
CONSTRAINT PK_Delegados PRIMARY KEY Delegados(id));

CREATE TABLE Evento(id int auto_increment,tipo varchar(20),fechaInicio date,hora varchar(25),fechaFin date,duracion varchar(25),lugar varchar(200),descripcion text,cupo int,fechaModificacion datetime,
CONSTRAINT PK_Evento PRIMARY KEY Evento(id));

CREATE TABLE Inscripciones(id int auto_increment,id_evento int,nombre varchar(25),apellidos varchar(50),email varchar(254),telefono char(9),
CONSTRAINT PK_Inscripciones PRIMARY KEY Inscripciones(id),
CONSTRAINT FK_Inscripciones FOREIGN KEY (id_evento) REFERENCES Evento(id));

CREATE TABLE Album(id int auto_increment,titulo varchar(150),imagenes boolean,fechaModificacion datetime,
CONSTRAINT PK_Album PRIMARY KEY Album(id));

CREATE TABLE Multimedia(id int auto_increment,imagen boolean,titulo varchar(150),id_album int,fechaModificacion datetime,
CONSTRAINT PK_Multimedia PRIMARY KEY Multimedia(id),
CONSTRAINT FK_Multimedia FOREIGN KEY (id_album) REFERENCES Album(id));

INSERT INTO SolicitudesDelegados (nombre,apellidos,telefono,email,razon) values ('Ana','Díaz Fernández',916254709,'anita@gmail.com','razon x');