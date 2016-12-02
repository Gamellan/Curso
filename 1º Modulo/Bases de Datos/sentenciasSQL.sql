CREATE DATABASE biblioteca;

use biblioteca;

CREATE TABLE Socios 
(ID INT(4), 
apellidos VARCHAR(20) UNIQUE, 
telefono CHAR(9) NOT NULL,
fechaAlta DATE DEFAULT '2000-01-01',
direccion VARCHAR(20),
CD INT(5) CHECK (CD BETWEEN 28000 AND 28999),
CONSTRAINT PK_SOCIOS PRIMARY KEY(ID));

CREATE TABLE Prestamos 
(NumPrestamo INT(2) AUTO_INCREMENT PRIMARY KEY,
NumSocio INT(4),
CONSTRAINT FK_PRESTAMOS FOREIGN KEY (NumSocio) REFERENCES socios(ID)
ON UPDATE CASCADE
ON DELETE SET NULL);



--------------------------------------

CREATE DATABASE CentroInvestigacion;

USE CentroInvestigacion;

CREATE TABLE Conferencias
(ID INT(5) PRIMARY KEY,
Nombre VARCHAR(15),
FechaHora DATETIME,
Duracion TIME,
Direccion VARCHAR(25));

CREATE TABLE Proyectos
(Nombre VARCHAR(15) PRIMARY KEY,
Fecha DATE);

CREATE TABLE Nuevos 
(Nombre VARCHAR(15),
CONSTRAINT FKNUEVOS FOREIGN KEY(Nombre)REFERENCES Proyectos(Nombre),
Presupuesto INT(3));

CREATE TABLE Revisiones
(Nombre VARCHAR(15),
CONSTRAINT FKREVISIONES FOREIGN KEY(Nombre)REFERENCES Proyectos(Nombre),
Motivo VARCHAR(60));

CREATE TABLE Investigadores
(DNI CHAR(9) PRIMARY KEY,
Nombre VARCHAR(15),
Direccion VARCHAR(25),
Localidad VARCHAR(25),
Telefono INT(9),
NombreProyecto VARCHAR(15),
IDConferencia INT(5),
Supervisor CHAR(9));

ALTER TABLE Investigadores ADD CONSTRAINT FK_SUPERVISA FOREIGN KEY (Supervisor) REFERENCES Investigadores(DNI)

ALTER TABLE Conferencias ADD CONSTRAINT pK_CONFERENCIA PRIMARY KEY (ID)


-------------------------------------------------------------------

CREATE DATABASE videoclub;

USE videoclub;

CREATE TABLE actores
(Nombre varchar(15) PRIMARY KEY,
Nacionalidad varchar(15),
Sexo varchar(6));

INSERT INTO actores
VALUES ('AlPacino','Estados Unidos', 'Varon');
INSERT INTO actores
VALUES ('Banderas','España', 'Varon');

CREATE TABLE directores
(Nombre varchar(15) PRIMARY KEY,
Nacionalidad varchar(15));

INSERT INTO directores
VALUES ('Tarantino','Estados Unidos');
INSERT INTO directores
VALUES ('Spielberg','Estados Unidos');
INSERT INTO directores
VALUES ('Mamoru Hosoda','Japon');

CREATE TABLE Productoras
(Productora varchar(15) PRIMARY KEY,
Nacionalidad varchar(15));

INSERT INTO productoras
VALUES ('Avalon','Estados Unidos');
INSERT INTO productoras
VALUES ('Estudio Ghibli','Japon');

CREATE TABLE peliculas 
(Titulo VARCHAR(15),
Fecha_Estreno DATE,
CONSTRAINT pkPelis PRIMARY KEY (Titulo,Fecha_Estreno),
Nombre_Director varchar(15),
CONSTRAINT fkdirector FOREIGN KEY(Nombre_Director)REFERENCES directores(Nombre),
Productora varchar(15),
CONSTRAINT fkproductora FOREIGN KEY(Productora)REFERENCES Productoras(Productora));

INSERT INTO peliculas
VALUES ('Toki wo kakeru', '2006/07/15','Mamoru Hosoda','Estudio Ghibli');
INSERT INTO peliculas
VALUES ('ET', '1982/12/06','Spielberg','Avalon');


CREATE TABLE participan
(Nombre_Actor VARCHAR(15),
Titulo_Pelicula VARCHAR(15),
CONSTRAINT pkparticipan PRIMARY KEY (Nombre_Actor,Titulo_Pelicula),
CONSTRAINT fkparticipan FOREIGN KEY(Nombre_Actor)REFERENCES actores(Nombre),
CONSTRAINT fkparticipa FOREIGN KEY(Titulo_Pelicula)REFERENCES peliculas(Titulo));

INSERT INTO participan
VALUES ('AlPacino','ET');
INSERT INTO participan
VALUES ('Banderas','ET');

CREATE TABLE ejemplares
(ID INT(5) PRIMARY KEY,
Estado varchar(10),
Titulo varchar(15),
CONSTRAINT fkejemplares FOREIGN KEY(Titulo)REFERENCES peliculas(Titulo));

INSERT INTO ejemplares
VALUES (1,'Bien','ET');
INSERT INTO ejemplares
VALUES (2,'Bien','Toki wo kakeru');

CREATE TABLE Socio
(ID INT(5) PRIMARY KEY,
Nombre varchar(15),
Direccion varchar(15),
Telefono CHAR(9),
ID_Avalador INT(5),
CONSTRAINT fksocio FOREIGN KEY(ID_Avalador)REFERENCES Socio(ID));

INSERT INTO socio
VALUES (1,'Pepe','C.Falsa','123456789',null);
INSERT INTO socio
VALUES (2,'Pedro','C.False','123456789',1);

CREATE TABLE alquileres
(ID_Ejemplar INT(5),
ID_Socio INT(5),
fecha_comienzo date,
fecha_devolucion date,
CONSTRAINT pkalquileres PRIMARY KEY (ID_Ejemplar,ID_Socio),
CONSTRAINT fkalquileres FOREIGN KEY (ID_Ejemplar)REFERENCES ejemplares(ID),
CONSTRAINT fkalquiler FOREIGN KEY (ID_Socio)REFERENCES socio(ID));

INSERT INTO alquileres
VALUES (1,1,'2016/10/20','2016/11/02');
INSERT INTO alquileres
VALUES (2,2,'2016/10/20','2016/11/02');


--------------------------------------------------------------------------


CREATE DATABASE hospital;

USE hospital;

CREATE TABLE polizas
(ID INT(5),
datos varchar(30));

CREATE TABLE clientes
(ID INT(5) PRIMARY KEY,
nombre varchar(15),
fechaNacimiento date,
categoria INT(1),
id_Poliza INT(5),
NCorrelativo INT(5)
);

CREATE TABLE areas
(ID INT(5) PRIMARY KEY,
superficie varchar(10),
habitantes INT(5)
);

CREATE TABLE medicos
(ID INT(5),
Nombre varchar(15),
Telefono INT(9),
ID_Area INT(5),
CONSTRAINT fkmedicos FOREIGN KEY (ID_Area)REFERENCES areas(ID),
Jefe boolean
);

CREATE TABLE hospitales
(ID INT(5) PRIMARY KEY,
Nombre varchar(15),
N_Camas INT(5),
ID_Area INT(5),
CONSTRAINT fkHospitales FOREIGN KEY (ID_Area)REFERENCES areas(ID)
);

CREATE TABLE concertados
(ID_Hospital INT(5) PRIMARY KEY,
Presupuesto float(5),
TipoServicio varchar(15),
CONSTRAINT fkConcertados FOREIGN KEY (ID_Hospital)REFERENCES hospitales(ID)
);

CREATE TABLE pagos
(ID_Poliza INT(5),
ID_Hospital INT(5),
CONSTRAINT pkPagos PRIMARY KEY (ID_Poliza,ID_Hospital)
);

CREATE TABLE hospitalizaciones
(ID INT(5) PRIMARY KEY,
fechaHospitalizacion date,
fechaAlta date,
ID_Hospital INT(5),
ID_Medico INT(5),
ID_Cliente INT(5),
CONSTRAINT fkhospitalizacionesCliente FOREIGN KEY (ID_Cliente)REFERENCES clientes(ID),
CONSTRAINT fkhospitalizacionesHospital FOREIGN KEY (ID_Hospital)REFERENCES hospitales(ID),
CONSTRAINT fkhospitalizacionesMedico FOREIGN KEY (ID_Medico)REFERENCES medicos(ID)
);

ALTER TABLE medicos ADD CONSTRAINT pK_medicos PRIMARY KEY (ID);

-----------------------------------------------------------------------------


CREATE DATABASE farmacia;

use farmacia;

CREATE TABLE clientes
(ID INT(5) PRIMARY KEY,
Nombre varchar(15),
CuentaBancaria INT(5),
FechaPago date
);

CREATE TABLE medicamentos
(ID INT(5) PRIMARY KEY,
Tipo varchar(15),
Stock INT(5),
Vendidos INT(5),
Nombre varchar(15),
Precio FLOAT(5),
Familia varchar(15)
);

CREATE TABLE ventas
(ID INT(5) PRIMARY KEY,
Unidades INT(5),
Fecha date,
ID_Cliente INT(5),
CONSTRAINT fkClientes FOREIGN KEY (ID_Cliente)REFERENCES clientes(ID),
ID_Medicamento INT(5),
CONSTRAINT fkMedicamento FOREIGN KEY (ID_Medicamento)REFERENCES medicamentos(ID)
);

CREATE TABLE laboratorios
(ID INT(5) PRIMARY KEY,
nombre varchar(15),
telefono varchar(15),
direccion varchar(15),
fax varchar(15),
PersonaContacto varchar(15)
);

CREATE TABLE compras
(ID INT(5) PRIMARY KEY,
ID_Medicamento INT(5),
CONSTRAINT fkMedicamentos FOREIGN KEY (ID_Medicamento)REFERENCES medicamentos(ID),
ID_Laboratorio INT(5),
CONSTRAINT fklaboratorio FOREIGN KEY (ID_Laboratorio)REFERENCES laboratorios(ID)
);

------------------------------------------------------------------------------


