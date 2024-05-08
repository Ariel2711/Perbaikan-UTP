//class turunan dari TiketKonser
class VIP extends TiketKonser {
    // Do your magic here...

    //konstruktor untuk inisialisasi variabel nama dan harga
    VIP(){
        nama = "VIP";
        harga = 100;
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
 