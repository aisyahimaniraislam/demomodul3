# Sistem Pemesanan Tiket Hotel

Aplikasi sederhana untuk memesan tiket hotel dengan harga yang berbeda berdasarkan jenis tiket, kategori umur, dan hari (weekend atau weekday). Aplikasi ini dibangun dengan Java menggunakan OOP (Object-Oriented Programming) dan JavaDoc untuk dokumentasi.

## Fitur

- Input data pemesan meliputi nama, hari, jenis tiket, dan kategori umur.
- Validasi data input untuk memastikan data tidak kosong.
- Penghitungan harga tiket berdasarkan jenis tiket, kategori umur, dan hari.
- Harga tambahan 20% jika pemesanan dilakukan pada hari Sabtu atau Minggu.
- Menampilkan informasi pemesanan tiket setelah proses perhitungan selesai.

## Struktur Kelas

- **Perhotelan** : Kelas utama yang mengelola informasi pemesanan tiket, mengimplementasikan antarmuka `Hotel`.
- **Hotel** : Antarmuka yang mendefinisikan metode `validasiInput`, `hitungHargaTiket`, dan `extramethod` yang digunakan dalam perhitungan harga tiket.
- **Main** : Kelas utama untuk menjalankan aplikasi.

## Instalasi dan Menjalankan Program

1. Clone repository ini.
2. Buka proyek di IDE Java seperti IntelliJ atau Eclipse.
3. Jalankan kelas `Main` untuk memulai aplikasi.

## Contoh Penggunaan

1. Program akan meminta Anda untuk memasukkan data berikut:
    - Nama pemesan
    - Hari (contoh: Senin, Sabtu, Minggu)
    - Jenis tiket (`Reguler` atau `Terusan`)
    - Kategori umur (`Dewasa` atau `Anak-anak`)

2. Jika data tidak valid (ada yang kosong), program akan menghentikan proses dan memberi peringatan.
3. Jika data valid, program akan menghitung harga tiket dan menampilkan informasi sebagai berikut:

   ```plaintext
   Nama: [Nama Pemesan]
   Hari: [Hari]
   Jenis Tiket: [Jenis Tiket]
   Kategori Umur: [Kategori Umur]
   Harga Tiket: Rp [Harga Tiket]

## Struktur Kode
### Kelas Perhotelan
Kelas ini mengimplementasikan antarmuka Hotel dan berisi:

- Atribut : nama, hari, jenisTiket, kategoriUmur, hargaTiket, dan isWeekend.
- Metode:
    * validasiInput : Memvalidasi input apakah data telah lengkap.
    * hitungHargaTiket : Menghitung harga tiket berdasarkan jenis tiket dan kategori umur.
    * extramethod : Menambahkan 20% biaya tambahan jika pemesanan dilakukan di akhir pekan.

### Antarmuka Hotel
- Menyediakan definisi untuk metode validasiInput, hitungHargaTiket, dan extramethod.

### Kelas Main
Kelas utama untuk menjalankan program, meminta input dari pengguna, dan menampilkan hasil pemesanan.

### Dokumentasi
Setiap kelas dan metode di dalam program ini sudah memiliki JavaDoc untuk memudahkan pemahaman kode dan penggunaan.

### Teknologi
- Java

### Lisensi
Proyek ini dilisensikan di bawah MIT License.

### Author

Dibuat oleh (Fakhri Ziddan Akbar)