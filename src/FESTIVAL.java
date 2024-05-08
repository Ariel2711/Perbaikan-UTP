//class turunan dari TiketKonser
class FESTIVAL extends TiketKonser {
   //Do your magic here...

   //konstruktor untuk inisialisasi variabel nama dan harga
   FESTIVAL(){
    nama = "FESTIVAL";
    harga = 80;
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
 