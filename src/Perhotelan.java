import java.util.Scanner;


/**
 * Kelas Perhotelan yang mengimplementasikan antarmuka Hotel.
 * Kelas ini mengelola informasi pemesanan tiket hotel berdasarkan jenis tiket, kategori umur, dan hari.
 */
 public class Perhotelan implements Hotel {
        private String nama; // rename
        private String hari;
        private String jenisTiket;
        private String kategoriUmur;
        private int hargaTiket;
        private boolean isWeekend;

    /**
     * Konstruktor  kelas Perhotelan.
     *
     * @param nama Nama pemesan
     * @param hari Hari pemesanan
     * @param jenisTiket Jenis tiket (Reguler/Terusan)
     * @param kategoriUmur Kategori umur pemesan (Dewasa/Anak-anak)
     */

        public Perhotelan(String nama, String hari, String jenisTiket, String kategoriUmur) {
            this.nama = nama;
            this.hari = hari;
            this.jenisTiket = jenisTiket;
            this.kategoriUmur = kategoriUmur;
            this.hargaTiket = 0;
            this.isWeekend = false;
        }


    /**
     * Mengatur nama pemesan.
     *
     * @param nama Nama pemesan
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengatur hari pemesanan.
     *
     * @param hari Hari pemesanan
     */

    public void setHari(String hari) {
        this.hari = hari;
    }


    /**
     * Mengatur jenis tiket.
     *
     * @param jenisTiket Jenis tiket (Reguler/Terusan)
     */

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    /**
     * Mengatur kategori umur pemesan.
     *
     * @param kategoriUmur Kategori umur pemesan (Dewasa/Anak-anak)
     */

    public void setKategoriUmur(String kategoriUmur) {
        this.kategoriUmur = kategoriUmur;
    }


    /**
     * Mengatur harga tiket.
     *
     * @param hargaTiket Harga tiket
     */

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }


    /**
     * Menentukan apakah hari yang dipilih merupakan akhir pekan.
     *
     * @param weekend Nilai boolean untuk akhir pekan
     */

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }



    /**
     * Memvalidasi apakah semua data input telah diisi.
     *
     * @return true jika semua data telah diisi, sebaliknya false
     */

    @Override
    public boolean validasiInput() {
            return !(nama.isEmpty() || hari.isEmpty() || jenisTiket.isEmpty() || kategoriUmur.isEmpty());
        }


    /**
     * Menghitung harga tiket berdasarkan jenis tiket, kategori umur, dan hari.
     */

        @Override
        public void hitungHargaTiket() {
            if (jenisTiket.equalsIgnoreCase("Reguler")) {
                if (kategoriUmur.equalsIgnoreCase("Dewasa")) {
                    hargaTiket = 75000;
                } else if (kategoriUmur.equalsIgnoreCase("Anak-anak")) {
                    hargaTiket = 60000;
                }
            } else if (jenisTiket.equalsIgnoreCase("Terusan")) {
                if (kategoriUmur.equalsIgnoreCase("Dewasa")) {
                    hargaTiket = 100000;
                } else if (kategoriUmur.equalsIgnoreCase("Anak-anak")) {
                    hargaTiket = 85000;
                }
            }

            if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
                isWeekend = true;
                extramethod();

            }
        }


    /**
     * Metode tambahan untuk menghitung biaya tambahan jika hari adalah akhir pekan.
     */

     @Override
     public void extramethod() {
         hargaTiket += hargaTiket * 0.2;
     }


    /**
     * Mendapatkan nama pemesan.
     *
     * @return Nama pemesan
     */

     public String getNama() {
            return nama;
        }


    /**
     * Mendapatkan hari pemesanan.
     *
     * @return Hari pemesanan
     */

        public String getHari() {
            return hari;
        }


    /**
     * Mendapatkan jenis tiket.
     *
     * @return Jenis tiket
     */

        public String getJenisTiket() {
            return jenisTiket;
        }


    /**
     * Mendapatkan kategori umur pemesan.
     *
     * @return Kategori umur pemesan
     */

        public String getKategoriUmur() {
            return kategoriUmur;
        }


    /**
     * Mendapatkan harga tiket.
     *
     * @return Harga tiket
     */

        public int getHargaTiket() {
            return hargaTiket;
        }
}


