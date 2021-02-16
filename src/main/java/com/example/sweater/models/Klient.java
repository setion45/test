package com.example.sweater.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Klient {
    @Id
    private String FIO;
    private String mail;
    private int phone, passport;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
    public Klient(){

    }
    public Klient(String FIO, String mail, int phone, int passport) {
        this.FIO = FIO;
        this.mail = mail;
        this.phone = phone;
        this.passport = passport;
    }
}
