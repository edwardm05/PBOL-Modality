package com.example.fxmodality.Model;
//1872003 - 1872005 - 1872009
public class Student {
    private String nama;
    private Float kat;
    private Float uts;
    private Float uas;
    private Float nilai;

    public Student(String nama, Float kat, Float uts, Float uas) {
        this.nama = nama;
        this.kat = kat;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Float getKat() {
        return kat;
    }

    public void setKat(Float kat) {
        this.kat = kat;
    }

    public Float getUts() {
        return uts;
    }

    public void setUts(Float uts) {
        this.uts = uts;
    }

    public Float getUas() {
        return uas;
    }

    public void setUas(Float uas) {
        this.uas = uas;
    }

    public Float getNilai() {
        return (float) (kat*0.5 + uts * 0.25 + uas * 0.25);
    }

    public void setNilai(Float nilai) {
        this.nilai = nilai;
    }
}
