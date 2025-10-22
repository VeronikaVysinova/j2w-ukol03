package cz.czechitas.java2webapps.ukol3.entity;

import java.util.Objects;

//entita s properties
public class Vizitka {
    String jmeno;
    String firma;
    String ulice;
    String obecPsc;
    String email;
    String telefon;
    String web;

    //bezparametricky konstruktor
    public Vizitka() {}

    //parametricky konstruktor
    public Vizitka(String jmeno,String firma,String ulice,String obecPsc,String email,String telefon,String web) {
    this.jmeno = Objects.requireNonNull(jmeno);
    this.firma = Objects.requireNonNull(firma);
    this.ulice = Objects.requireNonNull(ulice);
    this.obecPsc = Objects.requireNonNull(obecPsc);
    this.email = email;
    this.telefon = telefon;
    this.web = web;
    }

    //getter pro celou adresu
    public String getCelaAdresa(){
        return ulice + " " + obecPsc;
    }

    //ostatni gettry a settry
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = Objects.requireNonNull(jmeno);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = Objects.requireNonNull(firma);
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = Objects.requireNonNull(ulice);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = Objects.requireNonNull(obecPsc);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
