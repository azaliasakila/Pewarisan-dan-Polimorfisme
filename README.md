# Pewarisan dan Polimorfisme - PBO 2026

Repository ini berisi source code Java untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO) dengan menerapkan konsep pewarisan (*inheritance*) dan polimorfisme (*polymorphism*) pada objek bangun ruang dan bangun datar.

## 📚 Struktur Program

- **Bentuk.java**: Kelas induk yang menyimpan atribut `warna` serta menyediakan metode `getWarna()`, `setWarna()`, dan `printInfo()`.
- **BujurSangkar.java**: Kelas turunan dari `Bentuk` yang memiliki atribut `sisi` dan metode `hitungLuas()` untuk menghitung luas bujur sangkar.
- **Lingkaran.java**: Kelas turunan dari `Bentuk` yang memiliki atribut `radius` dan metode `hitungLuas()` untuk menghitung luas lingkaran.
- **Silinder.java**: Kelas yang digunakan untuk merepresentasikan silinder.
- **Main.java**: Kelas utama untuk membuat objek dan menjalankan program.

## ⚙️ Cara Kerja Program

1. Program dijalankan melalui metode `main()` pada kelas `Main`.
2. Program membuat objek `BujurSangkar` dengan panjang sisi 5 dan warna merah.
3. Program membuat objek `Lingkaran` dengan radius 7 dan warna biru.
4. Program membuat objek `Silinder` dengan parameter 10, 7, dan warna hijau.
5. Setiap objek menjalankan metode `printInfo()` untuk menampilkan informasi objek dan hasil perhitungannya.

## 🔍 Penerapan Konsep OOP

### 1. Pewarisan (Inheritance)

Kelas `BujurSangkar` dan `Lingkaran` menggunakan kata kunci `extends` untuk mewarisi kelas `Bentuk`.

Keduanya memanggil `super(warna)` pada konstruktor untuk menginisialisasi warna melalui konstruktor kelas induk. Dengan demikian, atribut dan metode yang dapat diakses dari kelas `Bentuk` bisa digunakan kembali oleh kelas turunannya.

### 2. Polimorfisme (Polymorphism)

Kelas `BujurSangkar` dan `Lingkaran` memiliki metode `printInfo()` dengan implementasi masing-masing. Keduanya juga mendefinisikan metode `hitungLuas()` sesuai dengan rumus bentuknya.

Dengan begitu, pemanggilan metode yang sama dapat menghasilkan informasi dan perhitungan yang berbeda sesuai jenis objek.

## 🛠️ Teknologi yang Digunakan

- Java
- Java Development Kit (JDK)
- Visual Studio Code

## 🎯 Tujuan Tugas

Memahami dan menerapkan konsep pewarisan dan polimorfisme dalam Java melalui pembuatan kelas dan objek yang merepresentasikan berbagai bentuk geometri.

## ▶️ Cara Menjalankan Program

1. Clone repository:

   ```bash
   git clone https://github.com/azaliasakila/Pewarisan-dan-Polimorfisme.git
   ```

2. Buka folder repository di Visual Studio Code.
3. Pastikan Java JDK sudah terpasang.
4. Buka file `Main.java`.
5. Jalankan program melalui tombol **Run**.

## 👩‍💻 Identitas

- **Nama:** Azalia Sakila
- **Program Studi:** S1 Teknik Informatika
- **Universitas:** Universitas Mataram
- **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)
- **Tahun:** 2026
