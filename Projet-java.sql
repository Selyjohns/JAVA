CREATE DATABASE "Projet-Java"

CREATE TABLE Locaux
(
IDLocal integer primary key,
Nom char(20),
Description char(150),
Lieu char(50)
);

CREATE TABLE Salles
(
IDSalle integer primary key,
Nom char(20),
Description char(150),
IDLocal integer references Locaux

);

CREATE TABLE Appareils
(
IDAppareils integer primary key,
Nom char(20),
IDSalle integer references Salles,
IDOS integer

);
CREATE TABLE Interfaces
(
IDIntefaces integer primary key,
Nom char(20),
AdresseMAC char(20),
EtatInterface boolean,
IDAppareil integer references Appareils
);

CREATE TABLE OS
(
IDOS integer primary key,
Nom char(20),
Version char(20)
);
ALTER TABLE Appareils ADD CONSTRAINT fk_Appareils foreign key (IDOS) REFERENCES OS;
