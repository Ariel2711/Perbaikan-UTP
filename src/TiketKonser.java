//class abstract yang mengimplementasikan interface HargaTiket, jadi class turunan dari TiketKonser harus mengimplementasikan method dari interface HargaTiket
abstract class TiketKonser implements HargaTiket {
    //variabel bertipe String untuk menyimpan nama jenis tiket, dengan modifier protected
    protected String nama;

    //variabel bertipe double untuk menyimpan harga jenis tiket, dengan modifier protected
    protected double harga;

    //method getter bernilai String yang harus di implementasikan oleh class turunan
    abstract String getNama();
 }
 