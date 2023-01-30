package com.example.SecurityDB.Project.local.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student{

    @Id
    @Column(name="email")
    @Email(message="Please, provide a valid Email")
    private String email;

    @Column(name="nume")
    private String nume;


    @Column(name="prenume")
    private String prenume;

    @Column(name="email_institutionalizat")
    private String email_institutionalizat;

    @Column(name="parola")
    private String parola;

    @Column(name="cod_adresa")
    private Long cod_adresa;

    @Column(name="data_nasterii")
    private Date data_nasterii;

    @Column(name="tip_client")
    private String tip_client;

    @Column(name="nr_telefon")
    private String nr_telefon;


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
