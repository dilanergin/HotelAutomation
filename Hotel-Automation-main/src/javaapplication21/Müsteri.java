/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author PC
 */
public class Müsteri {
    private String isim;
    private String telefon;
    private String kimlik;
    private String cinsiyet;
    private String mail;
    private String girisTarih;
    private int odaKisiSayisi;
    private int odaNo;
    private double fiyat;

    public Müsteri(String isim, String telefon, String kimlik, String cinsiyet, String mail, String girisTarih, int odaKisiSayisi, int odaNo, double fiyat) {
        this.isim = isim;
        this.telefon = telefon;
        this.kimlik = kimlik;
        this.cinsiyet = cinsiyet;
        this.mail = mail;
        this.girisTarih = girisTarih;
        this.odaKisiSayisi = odaKisiSayisi;
        this.odaNo = odaNo;
        this.fiyat = fiyat;
    }
    public String getKimlik(){
        return kimlik;
    }
    public int getOdaNo(){
        return odaNo;
    }
    public String getGirisTarihi(){
        return getGirisTarih();
    }
    public double getFiyat(){
        return fiyat;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @return the cinsiyet
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @return the girisTarih
     */
    public String getGirisTarih() {
        return girisTarih;
    }

    /**
     * @return the odaKisiSayisi
     */
    public int getOdaKisiSayisi() {
        return odaKisiSayisi;
    }

    
}
