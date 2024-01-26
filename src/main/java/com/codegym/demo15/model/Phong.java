package com.codegym.demo15.model;

import javax.persistence.*;

@Entity
@Table(name = "phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
private String derail;
private double price;
private String status;
private int numberOfPerson;
private int numberBed;

    public Phong() {
    }

    public Phong(Long id, String name, String derail, double price, String status, int numberOfPerson, int numberBed) {
        this.id = id;
        this.name = name;
        this.derail = derail;
        this.price = price;
        this.status = status;
        this.numberOfPerson = numberOfPerson;
        this.numberBed = numberBed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDerail() {
        return derail;
    }

    public void setDerail(String derail) {
        this.derail = derail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }
}
