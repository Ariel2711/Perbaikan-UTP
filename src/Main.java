//import package SimpleDateFormat, Date, dan Scanner
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Do your magic here...

        //deklarasi scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Pemesanan Tiket!");

        //input nama pemesan melalui scanner dan simpan di variabel namaPemesan
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.next();

        //input jenis tiket yang dipilih berupa angka int 1-5 dan simpan di variabel pilihan
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        //deklarasi class TiketKonser yang nantinya bisa diberi nilai class turunannya
        TiketKonser tiketKonser;

        //deklarasi class PemesananTiket
        PemesananTiket pemesananTiket;


        //pengkondisian dengan switch case untuk mengecek pilihan jenis tiket yang dipilih, parameter yang digunakan adalah variabel pilihan, lalu inisialisasi tiketKonser dan pemesananTiket untuk masing-masing case, lalu cetak detail tiket
        switch (pilihan) {
            case 1:
                tiketKonser = new CAT8();
                pemesananTiket = new PemesananTiket(namaPemesan, generateKodeBooking(), getCurrentDate(), tiketKonser);
                pemesananTiket.cetakTiket();
                break;
            case 2:
                tiketKonser = new CAT1();
                pemesananTiket = new PemesananTiket(namaPemesan, generateKodeBooking(), getCurrentDate(), tiketKonser);
                pemesananTiket.cetakTiket();
                break;
            case 3:
                tiketKonser = new FESTIVAL();
                pemesananTiket = new PemesananTiket(namaPemesan, generateKodeBooking(), getCurrentDate(), tiketKonser);
                pemesananTiket.cetakTiket();
                break;
            case 4:
                tiketKonser = new VIP();
                pemesananTiket = new PemesananTiket(namaPemesan, generateKodeBooking(), getCurrentDate(), tiketKonser);
                pemesananTiket.cetakTiket();
                break;
            case 5:
                tiketKonser = new VVIP();
                pemesananTiket = new PemesananTiket(namaPemesan, generateKodeBooking(), getCurrentDate(), tiketKonser);
                pemesananTiket.cetakTiket();
                break;    
            //jika pilihan tidak valid (diluar 1-5) maka akan masuk ke default dimana akan dicetak pesan dan kode akan berhenti
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
                break;
        }

        //close scanner
        scanner.close();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}