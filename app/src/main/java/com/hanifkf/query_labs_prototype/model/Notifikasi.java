package com.hanifkf.query_labs_prototype.model;

public class Notifikasi {
    int foto;
    String nama;
    String content;
    String waktu;

    public Notifikasi(int foto,String name, String content , String waktu){
        this.foto = foto;
        this.nama = name;
        this.content = content;
        this.waktu = waktu;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
