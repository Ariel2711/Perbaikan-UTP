//class turunan dari TiketKonser
public class CAT8 extends TiketKonser {
   //Do your magic here...
   
   //konstruktor untuk inisialisasi variabel nama dan harga
   CAT8(){
      nama = "CAT 8";
      harga = 50;
   }

   //implementasi method getNama dari class abstract TiketKonser
   public String getNama(){
       return nama;
   }

   //implementasi method getHarga dari interface HargaTiket
   public double getHarga(){
       return harga;
   }
}
