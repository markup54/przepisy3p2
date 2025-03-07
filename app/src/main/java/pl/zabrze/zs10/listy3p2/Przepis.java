package pl.zabrze.zs10.listy3p2;

import java.util.ArrayList;

public class Przepis {
    private String nazwa;
    private String kategoria;
    private int idObrazka;
    private int czasPrzygotowania; //wyrazone w minutach
    private String[] skladniki;
    private String opis;

    public Przepis(String nazwa, String kategoria, int idObrazka, int czasPrzygotowania, String [] skladniki, String opis) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.czasPrzygotowania = czasPrzygotowania;
        this.skladniki = skladniki;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return nazwa ;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public int getCzasPrzygotowania() {
        return czasPrzygotowania;
    }

    public String[] getSkladniki() {
        return skladniki;
    }

    public String getOpis() {
        return opis;
    }
}
