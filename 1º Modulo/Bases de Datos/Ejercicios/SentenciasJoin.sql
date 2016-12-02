CREATE DATABASE Investigadores;

use Investigadores;

CREATE TABLE facultad
(Codigo INT(5) PRIMARY KEY,
Nombre varchar(25)
);

CREATE TABLE investigadores
(DNI VARCHAR(8) PRIMARY KEY,
nomApels varchar(25),
Facultad INT(5),
CONSTRAINT fkInvestigadores FOREIGN KEY (Facultad)REFERENCES facultad(Codigo)
);

CREATE TABLE equipos
(NumSerie char(4) PRIMARY KEY,
nombre varchar(25),
Facultad INT(5),
CONSTRAINT fkEquipos FOREIGN KEY (Facultad)REFERENCES facultad(Codigo)
);

CREATE TABLE reserva
(DNI varchar(8),
CONSTRAINT fk1Reserva FOREIGN KEY (DNI)REFERENCES investigadores(DNI),
NumSerie char(4),
CONSTRAINT fk2Reserva FOREIGN KEY (NumSerie)REFERENCES equipos(NumSerie),
CONSTRAINT pkReserva PRIMARY KEY (DNI,NumSerie),
comienzo datetime,
fin datetime
);


INSERT INTO facultad VALUES(1,'POLITICA');
INSERT INTO facultad VALUES(2,'INFORMATICA');

INSERT INTO investigadores VALUES(111,'Pedro Sanchez', 1);
INSERT INTO investigadores VALUES(222,'Pepe Garcia', 2);
INSERT INTO investigadores VALUES(333,'Juanito Botijo', 1);
INSERT INTO investigadores VALUES(444,'El Tonto', NULL);

INSERT INTO equipos VALUES(1,'PSOE', 1);
INSERT INTO equipos VALUES(2,'JAVA JUNIOR', 2);
INSERT INTO equipos VALUES(3,'PSOE', 1);

INSERT INTO reserva VALUES(111, 1, '2014/01/01','2017/01/01');
INSERT INTO reserva VALUES(222, 2, '1999/02/02','215/04/24');
INSERT INTO reserva VALUES(111, 2, '2014/01/01','2017/01/01');
INSERT INTO reserva VALUES(222, 1, '1999/02/02','215/04/24');
INSERT INTO reserva VALUES(333, 1, '1999/02/02','215/04/24');
--1--
SELECT nomApels as 'Nombre investigador', DNI, nombre as 'Nombre facultad'
FROM investigadores RIGHT JOIN facultad ON facultad=Codigo;
--2--
SELECT equipos.NumSerie as 'Numero equipo', equipos.nombre as 'Nombre equipo', facultad.nombre as 'Nombre facultad', investigadores.nomApels as 'Nombre investiador'
FROM equipos RIGHT JOIN reserva ON equipos.NumSerie = reserva.NumSerie
LEFT JOIN investigadores ON reserva.DNI = investigadores.DNI
LEFT JOIN facultad ON investigadores.facultad = facultad.Codigo;
--3--
SELECT investigadores.DNI , investigadores.nomApels as 'Nombre Investigador', facultad.nombre as 'Nombre Facultad', 
equipos.NumSerie as 'Numero equipo', equipos.nombre as 'Nombre Equipo', reserva.comienzo as 'Fecha Comienzo', reserva.fin as 'Fecha Fin'
FROM facultad RIGHT JOIN investigadores ON investigadores.facultad = facultad.Codigo
LEFT JOIN reserva ON investigadores.DNI = reserva.DNI
LEFT JOIN equipos ON reserva.NumSerie = equipos.NumSerie;



