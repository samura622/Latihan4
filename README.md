# Latihan4
Nama : Muhammad Fiqri Febrian Parlin Jaya Putra
NIM : 202210370311302

Saya meng copy-paste punya teman saya jadi saya tidak terlalu banyak membahas tentang code ini
tapi insyaallah saya paham 

Latihan 1

Penjelasan Singkat Kode:

- Input Pengguna:
  - Program ini menggunakan kelas `Scanner` untuk menerima input dari pengguna melalui terminal.
  - Pengguna dapat memilih berbagai opsi yang ditampilkan dalam menu untuk melakukan analisis teks.

- Fungsi Utama:
  - Metode `main` adalah titik masuk utama program. Di dalamnya terdapat loop tak terbatas (`while(true)`) yang akan terus berjalan sampai pengguna memilih untuk keluar.

- Opsi Menu:
  - Program menawarkan opsi menu yang memungkinkan pengguna melakukan beberapa tindakan, seperti memasukkan teks, menghitung jumlah karakter, menghitung jumlah kata, mencari kata dalam teks, atau keluar dari program.

- Fungsi-fungsi:
  - `inputText()` untuk meminta dan menyimpan teks yang dimasukkan oleh pengguna ke dalam variabel `text`. Teks dipisahkan menjadi kata-kata dan disimpan dalam `ArrayList` `words`.
  - `countCharacters()` menghitung jumlah karakter dalam teks yang telah dimasukkan.
  - `countWords()` menghitung jumlah kata dalam teks.
  - `searchWord()` mencari berapa kali suatu kata tertentu muncul dalam teks yang telah dimasukkan sebelumnya.

- Keluar dari Program:
  - Pengguna dapat keluar dari program dengan memilih opsi "5".


Latihan 2

Berikut adalah penjelasan singkat tentang bagaimana program ini berfungsi:

Fungsi Program:

1. Input Teks:
   - Ketika pengguna memilih opsi 1, mereka diminta untuk memasukkan teks. Teks yang dimasukkan kemudian disimpan dalam variabel `text`.

2. Hitung Jumlah Karakter:
   - Pilihan 2 menghitung jumlah karakter dalam teks yang telah dimasukkan.

3. Hitung Jumlah Kata:
   - Pilihan 3 menghitung jumlah kata dalam teks. Kata-kata dipisahkan dengan spasi, diubah menjadi huruf kecil, dan disimpan dalam ArrayList `words`.

4. Cari Kata dalam Teks:
   - Pilihan 4 meminta pengguna untuk memasukkan kata yang ingin dicari dalam teks. Program kemudian menghitung berapa kali kata tersebut muncul dalam teks yang telah dimasukkan sebelumnya.

5. Keluar:
   - Pilihan 5 untuk keluar dari program.

Struktur Program:

- Terdapat variabel statis `text` yang menyimpan teks yang dimasukkan dan `words` yang merupakan ArrayList kata-kata dalam teks.
- Metode `inputText()` untuk meminta dan memasukkan teks ke dalam variabel `text` serta memisahkan kata-kata dalam teks ke dalam `words`.
- Metode `countCharacters()` untuk menghitung jumlah karakter dalam teks.
- Metode `countWords()` untuk menghitung jumlah kata dalam teks berdasarkan panjang `ArrayList` `words`.
- Metode `searchWord()` untuk mencari jumlah kemunculan suatu kata dalam teks.

Input dan Output:

- Program menggunakan kelas `Scanner` untuk menerima input dari pengguna melalui terminal.
- Output program menampilkan hasil analisis teks sesuai dengan pilihan yang dibuat oleh pengguna.

