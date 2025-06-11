package com.example.phrase.models;

import jakarta.persistence.*;

@Entity //Una entidad es la parte que identificamos en el diseño del sistema. Parte del sistema que identificamos como tabla
@Table(name="texts") //Para cambiar el nombre de la tabla
public class Phrase {
    @Id //Las anotaciones podemos ponerlas a las clases, atributos o métodos
    @GeneratedValue(strategy= GenerationType.IDENTITY) //El type identity significa autoincremental
    private int id;
    private String text;
    private String author;

    public Phrase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

    /* PASOS:
    En el public class creo los atributos que tendrá la entidad y defino el pk y como se debe construir.
    Creo el constructor vacio para que springboot haga las instancias necesarias
    Creo los getters y setters
    */




