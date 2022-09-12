CREATE DATABASE contactBook;

USE contactBook;

CREATE TABLE contact (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    phone_number varchar(20),
    email varchar(50),
    birth_date date,
    PRIMARY KEY(id)
);

INSERT INTO contact VALUES (1, "Sanji", "3118778785", "Sangoro@gmail.com", "1997-10-25");
INSERT INTO contact VALUES (2, "Zoro", "3208745857", "Marimo@hotmail.com", "1997-9-25");
INSERT INTO contact VALUES (3, "Luffy", "3178770085", "Ikuu@gmail.com", "1997-10-25");
INSERT INTO contact VALUES (4, "Nami", "3008878799", "Berries@gmail.com", "1997-10-25");
INSERT INTO contact VALUES (5, "Brook", "3028770085", "Yohoho@yahoo.com", "1997-10-25");
INSERT INTO contact VALUES (6, "Chopper", "3187877785", "TTchopper@outlook.com", "1997-10-25");
INSERT INTO contact VALUES (7, "Franky", "3778778785", "Supercola@gmail.com", "1997-10-25");
INSERT INTO contact VALUES (8, "Ussop", "3079774885", "sogeking@gmail.com", "1997-10-25");
INSERT INTO contact VALUES (9, "Robin", "3006974885", "Furobin@fakemail.com", "1987-05-15");