package com.example.ekz2.entity;

import jakarta.persistence.*;


import java.util.Objects;

@Entity
@Table(name = "groupi")
public class Groupi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "groupa")
    private String groupa;
    @Basic
    @Column(name = "year")
    private String year;
    @Basic
    @Column(name = "kafedra")
    private String kafedra;
    @Basic
    @Column(name = "img_url")
    private String imgUrl;


    public Groupi(){}

    public Groupi(String groupa, String year, String kafedra) {
        this.groupa=groupa;
        this.year=year;
        this.kafedra=kafedra;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupa() {
        return groupa;
    }

    public void setGroupa(String groupa) {
        this.groupa = groupa;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groupi groupi = (Groupi) o;
        return id == groupi.id && Objects.equals(groupa, groupi.groupa) && Objects.equals(year, groupi.year) && Objects.equals(kafedra, groupi.kafedra) && Objects.equals(imgUrl, groupi.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupa, year, kafedra, imgUrl);
    }
}
