CREATE TABLE CHARACTER(
    id INT AUTO_INCREMENT PRIMARY_KEY,
    name VARCHAR(50),
    description VARCHAR(500),
    id_character INT,
    id_race INT
);

CREATE TABLE MAGIC(
    id INT AUTO_INCREMENT PRIMARY_KEY,
    name VARCHAR(50),
    description VARCHAR(500)
);

