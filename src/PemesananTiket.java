class PemesananTiket {
   // Do your magic here...

    //deklarasi variabel dengan modifier private
    private String namaPemesan;
    private String kode;
    private String tanggal;
    private TiketKonser tiket;

    //buat konstruktor dengan parameter untuk nilai masing-masing variabel, lalu lakukan inisialisasi
    public PemesananTiket(String namaPemesan, String kode, String tanggal, TiketKonser tiket) {
      this.namaPemesan = namaPemesan;
      this.kode = kode;
      this.tanggal = tanggal;
      this.tiket = tiket;
    }

    //print detail pemesanan sesuai format, dengan detail nama pemesan, kode booking, tanggal pesanan, jenis tiket yang dipesan, dan total harga
    public void cetakTiket() {
      System.out.println("----- Detail Pemesanan -----");
      System.out.println("Nama Pemesan: " + namaPemesan);
      System.out.println("Kode Booking: " + kode);
      System.out.println("Tanggal Pesanan: " + tanggal);
      System.out.println("Tiket yang dipesan: " + tiket.getNama());
      System.out.println("Total harga: " + tiket.getHarga() + " USD");
  }
 }