package com.repository.jparepository.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Alien{

    @Id
    @GeneratedValue
    private int aid;
    private String aname;
    private String tech;

    public Alien() {
        super();
        //System.out.println("Object created...");
    }

    public int getAid() {
        return this.aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return this.aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return this.tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
    public void show(){
        System.out.println("in show");
    }

    @Override
    public String toString() {
        return "{" +
            " aid='" + getAid() + "'" +
            ", aname='" + getAname() + "'" +
            ", tech='" + getTech() + "'" +
            "}";
    }

}
