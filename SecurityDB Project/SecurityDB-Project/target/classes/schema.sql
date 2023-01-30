DROP TABLE student;

CREATE TABLE student
    ( email VARCHAR2(50) CONSTRAINT email_student_nn NOT NULL,
      nume VARCHAR2(50)  CONSTRAINT nume_student_nn NOT NULL,
      prenume VARCHAR2(50)CONSTRAINT prenume_student_nn NOT NULL,
      email_institutionalizat VARCHAR2(150) GENERATED ALWAYS AS (lower(prenume) ||'.'|| lower(nume)||'@ecs.com'),
      parola VARCHAR2(15) CONSTRAINT parola_student_nn NOT NULL,
      cod_adresa NUMBER CONSTRAINT cod_adresa_student_nn NOT NULL,
      data_nasterii DATE CONSTRAINT data_nasterii_nn NOT NULL,
      tip_client VARCHAR2(30),
      nr_telefon VARCHAR2(25));


