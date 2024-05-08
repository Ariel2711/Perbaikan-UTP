//class turunan dari TiketKonser
class CAT1 extends TiketKonser {
    //Do your magic here...

    //konstruktor untuk inisialisasi variabel nama dan harga
    CAT1(){
        nama = "CAT 1";
        harga = 70;
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