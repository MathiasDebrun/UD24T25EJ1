DROP TABLE IF EXISTS Articulo;
DROP table IF EXISTS Fabricante;


CREATE TABLE `Fabricante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `Articulo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `precio` int DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `Articulo_fk` FOREIGN KEY (`fid`) REFERENCES `Fabricante` (`id`)
);


insert into Fabricante (nombre)values('Jose');
insert into Fabricante (nombre)values('Juan');
insert into Fabricante (nombre)values('Pedro');
insert into Fabricante (nombre)values('Jordi');
insert into Fabricante (nombre)values('Jonatan');

insert into Articulo (nombre, precio,fid) values ('Zapato',100,1);
insert into Articulo (nombre, precio,fid) values ('Campera',120,3);
insert into Articulo (nombre, precio,fid) values ('Sudadera',100,2);
insert into Articulo (nombre, precio,fid) values ('Gorra',1100,4);

