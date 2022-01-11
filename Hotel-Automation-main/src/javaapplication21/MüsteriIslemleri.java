/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MüsteriIslemleri {
    private static ArrayList<Müsteri> müsteriArr=new ArrayList<>();
    private static ArrayList<MusteriCikis> müsteriCikisArr=new ArrayList<>();
            
      public String ekleMüsteri(Müsteri müsteri){
        for(int i=0;i<müsteriArr.size();i++){
            if((müsteriArr.get(i).getKimlik()).equals(müsteri.getKimlik())){
                return "Mevcut Kullanıcıyı Tekrar Giremezsiniz";
            }
            if(müsteriArr.get(i).getOdaNo()==müsteri.getOdaNo()){
                return "Bu oda dolu. Başka oda deneyiniz.";
            }
        }
        müsteriArr.add(müsteri);
                
        return "Kullanıcı Eklendi";
    }
      public void müsterıCıkar(MusteriCikis musteriCıkar){
          for(int i=0;i<müsteriArr.size();i++){
            if(müsteriArr.get(i).getOdaNo()==musteriCıkar.getOdaNo()){
                müsteriArr.remove(i);
                müsteriCikisArr.add(musteriCıkar);
            }
        }
          
      
      }
       public ArrayList<MusteriCikis> getArrayListOfMüsteriCikisesArr(){
        return müsteriCikisArr;
    }
    public ArrayList<Müsteri> getArrayListOfMüsteriArr(){
        return müsteriArr;
    }
    
    public double hesapla(MusteriCikis musteriCikis){
        double toplam=musteriCikis.getKaldıgıGun()*musteriCikis.getFiyat();
        return toplam;
    }
    public Müsteri OdaNumarasıAra(int odaNumarası){
    for(int i=0;i<müsteriArr.size();i++){
        if(odaNumarası==müsteriArr.get(i).getOdaNo()){
            return müsteriArr.get(i);
        }
    }
    
    return null;
    }
   
    
}
