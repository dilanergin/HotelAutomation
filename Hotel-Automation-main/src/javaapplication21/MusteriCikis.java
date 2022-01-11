/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author PC
 */
public class MusteriCikis extends Müsteri{
    private int kaldıgıGun;
    public MusteriCikis(String isim, String telefon, String kimlik, String cinsiyet, String mail, String girisTarih, int odaKisiSayisi, int odaNo, double fiyat,int kaldıgıGun) {
        super(isim, telefon, kimlik, cinsiyet, mail, girisTarih, odaKisiSayisi, odaNo, fiyat);
        this.kaldıgıGun=kaldıgıGun;
    }
    public int getKaldıgıGun(){
        return kaldıgıGun;
    }
    
}
