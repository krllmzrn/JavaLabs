package com.example.ekz2.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "kafedra")
public class Kafedra {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "kafedra")
    private String kafedra;
    @Basic
    @Column(name = "full_name")
    private String fullName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kafedra kafedra1 = (Kafedra) o;
        return id == kafedra1.id && Objects.equals(kafedra, kafedra1.kafedra) && Objects.equals(fullName, kafedra1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kafedra, fullName);
    }
}
