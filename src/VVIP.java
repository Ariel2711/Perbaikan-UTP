//class turunan dari TiketKonser
class VVIP extends TiketKonser {
   // Do your magic here...

   //konstruktor untuk inisialisasi variabel nama dan harga
   VVIP(){
    nama = "UNLIMITED EXPERIENCE";
    harga = 150;
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