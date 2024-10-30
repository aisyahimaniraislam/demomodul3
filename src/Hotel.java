
/**
 * Antarmuka untuk Hotel, menyediakan metode dasar yang harus diimplementasikan.
 */

public interface Hotel {

    /**
     * Memvalidasi input untuk memastikan semua data telah diisi.
     *
     * @return true jika valid, false jika tidak
     */
    boolean validasiInput();

    /**
     * Menghitung harga tiket berdasarkan jenis tiket, kategori umur, dan hari.
     */
    void hitungHargaTiket();

    /**
     * Metode tambahan untuk menghitung biaya tambahan pada akhir pekan.
     */

    void extramethod();
}
