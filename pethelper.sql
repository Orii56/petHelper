<<<<<<< Updated upstream
DROP DATABASE pethelper;
CREATE DATABASE pethelper;
use pethelper;

DROP TABLE IF EXISTS tipo_usuario;
CREATE TABLE tipo_usuario(
id_tipo int not null auto_increment primary key,
tipo varchar(50)
);

DROP TABLE IF EXISTS tipo_mascota;
CREATE TABLE tipo_mascota(
id_tipo int not null auto_increment primary key, 
tipo varchar(50)
);

DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario(
id_usuario int not null auto_increment,
mail varchar(50) not null,
nombre varchar(50) not null,
contrasena varchar(50) not null, 
direccion varchar(200),
cp int not null, 
ciudad varchar(50),
pais varchar(50),
tipo_user int,
PRIMARY KEY (id_usuario),
FOREIGN KEY (tipo_user) references tipo_usuario(id_tipo)
);

DROP TABLE IF EXISTS mascota;
CREATE TABLE mascota(
id_mascota int not null auto_increment,
id_usuario int,
nombre varchar(50) not null, 
fecha_nacimiento date,
sexo varchar(10),
raza varchar(50),
tipo_mascota int not null, 
PRIMARY KEY (id_mascota),
FOREIGN KEY (id_usuario) references usuario(id_usuario),
FOREIGN KEY (tipo_mascota) references tipo_mascota(id_tipo)
);

DROP TABLE IF EXISTS desparasitacion;
CREATE TABLE desparasitacion(
id_desparasitacion int not null auto_increment primary key, 
fecha date not null,
tipo varchar(50),
validez varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);

DROP TABLE IF EXISTS higiene;
CREATE TABLE higiene(
id_higiene int not null auto_increment primary key,
fecha date not null, 
tipo varchar(50),
validez varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);

DROP TABLE IF EXISTS vacunas;
CREATE TABLE vacunas(
id_vacuna int not null auto_increment primary key,
fecha date not null,
tipo varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);



INSERCIONES

INSERT INTO tipo_usuario (tipo) VALUES ('Propietario');
INSERT INTO tipo_usuario (tipo) VALUES ('Profesional');
INSERT INTO tipo_usuario (tipo) VALUES ('Organizacion');


INSERT INTO tipo_mascota (tipo) VALUES ('Perro');
INSERT INTO tipo_mascota (tipo) VALUES ('Gato');
INSERT INTO tipo_mascota (tipo) VALUES ('Pájaro');
INSERT INTO tipo_mascota (tipo) VALUES ('Roedor');
INSERT INTO tipo_mascota (tipo) VALUES ('Reptil');
INSERT INTO tipo_mascota (tipo) VALUES ('Hurón');
INSERT INTO tipo_mascota (tipo) VALUES ('Otros');


=======
DROP DATABASE pethelper;
CREATE DATABASE pethelper;
use pethelper;

DROP TABLE IF EXISTS tipo_usuario;
CREATE TABLE tipo_usuario(
id_tipo int not null auto_increment primary key,
tipo varchar(50)
);

DROP TABLE IF EXISTS tipo_mascota;
CREATE TABLE tipo_mascota(
id_tipo int not null auto_increment primary key, 
tipo varchar(50)
);

DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario(
id_usuario int not null auto_increment,
mail varchar(50) not null,
nombre varchar(50) not null,
contrasena varchar(50) not null, 
direccion varchar(200),
cp int not null, 
ciudad varchar(50),
pais varchar(50),
tipo_user int,
PRIMARY KEY (id_usuario),
FOREIGN KEY (tipo_user) references tipo_usuario(id_tipo)
);

DROP TABLE IF EXISTS mascota;
CREATE TABLE mascota(
id_mascota int not null auto_increment,
id_usuario int,
nombre varchar(50) not null, 
fecha_nacimiento date,
sexo varchar(10),
raza varchar(50),
tipo_mascota int not null, 
PRIMARY KEY (id_mascota),
FOREIGN KEY (id_usuario) references usuario(id_usuario),
FOREIGN KEY (tipo_mascota) references tipo_mascota(id_tipo)
);

DROP TABLE IF EXISTS desparasitacion;
CREATE TABLE desparasitacion(
id_desparasitacion int not null auto_increment primary key, 
fecha date not null,
tipo varchar(50),
validez varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);

DROP TABLE IF EXISTS higiene;
CREATE TABLE higiene(
id_higiene int not null auto_increment primary key,
fecha date not null, 
tipo varchar(50),
validez varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);

DROP TABLE IF EXISTS vacunas;
CREATE TABLE vacunas(
id_vacuna int not null auto_increment primary key,
fecha date not null,
tipo varchar(50),
id_mascota int not null, 
FOREIGN KEY (id_mascota) references mascota(id_mascota)
);



INSERCIONES

INSERT INTO tipo_usuario (tipo) VALUES ('Propietario');
INSERT INTO tipo_usuario (tipo) VALUES ('Profesional');
INSERT INTO tipo_usuario (tipo) VALUES ('Organizacion');


INSERT INTO tipo_mascota (tipo) VALUES ('Perro');
INSERT INTO tipo_mascota (tipo) VALUES ('Gato');
INSERT INTO tipo_mascota (tipo) VALUES ('Pájaro');
INSERT INTO tipo_mascota (tipo) VALUES ('Roedor');
INSERT INTO tipo_mascota (tipo) VALUES ('Reptil');
INSERT INTO tipo_mascota (tipo) VALUES ('Hurón');
INSERT INTO tipo_mascota (tipo) VALUES ('Otros');


>>>>>>> Stashed changes
