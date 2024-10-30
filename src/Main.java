import java.util.Scanner;

/**
 * Kelas utama Main untuk menjalankan program.
 */

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Nama: ");
            String nm = input.nextLine();

            System.out.print("Masukkan Hari (contoh: Senin, Sabtu, Minggu): ");
            String hari = input.nextLine();

            System.out.print("Masukkan Jenis Tiket (Reguler/Terusan): ");
            String jenisTiket = input.nextLine();

            System.out.print("Masukkan Kategori Umur (Dewasa/Anak-anak): ");
            String kategoriUmur = input.nextLine();

            // Membuat objek Perhotelan
            Perhotelan perhotelan = new Perhotelan(nm, hari, jenisTiket, kategoriUmur);

            // Validasi input
            if (!perhotelan.validasiInput()) {
                System.out.println("Data harus diisi.");
                return;
            }

            // Hitung harga tiket
            perhotelan.hitungHargaTiket();

            // Tampilkan hasil
            System.out.println("Nama: " + perhotelan.getNama());
            System.out.println("Hari: " + perhotelan.getHari());
            System.out.println("Jenis Tiket: " + perhotelan.getJenisTiket());
            System.out.println("Kategori Umur: " + perhotelan.getKategoriUmur());
            System.out.println("Harga Tiket: Rp " + perhotelan.getHargaTiket());
        }

}