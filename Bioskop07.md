1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 
   ke-0? Jelaskan! 
2. Mengapa terdapat null pada daftar nama penonton? 
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
    penonton [0] [0] = "Amin";
    penonton [0] [1] = "Bena";
    penonton [1] [0] = "Candra";
    penonton [1] [1] = "Dela";
    penonton [2] [0] = "Eka";
    penonton [2] [1] = "Farhan";
    penonton [3] [0] = "Gisel";
    penonton [3] [1] = "Hana";
4. Tambahkan kode program sebagai berikut:
    System.out.println (penonton.length);
    System.out.println (penonton[0].length);
    System.out.println (penonton[1].length);
    System.out.println (penonton[2].length);
    System.out.println (penonton[3].length);
    Jelaskan fungsi dari penonton.length dan penonton[0].length!
    Apakah penonton[0].length, penonton[1].length, penonton[2].length, penonton[3].length memiliki nilai yang sama? Mengapa?
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris
   pada array menggunakan for loop. Compile, run, lalu amati hasilnya
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris 
   pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya. 
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 
   menggunakan for loop. Compile, run, lalu amati hasilnya. 
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach 
   loop. Compile, run, lalu lakukan amati hasilnya.
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama 
  penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop? 
11. Berapa indeks baris maksimal untuk array penonton? 
12. Berapa indeks kolom maksimal untuk array penonton? 
13. Apa fungsi dari String.join()?

Jawab : 
1. Tidak,pengisian elemen arrqay tidak harus berurutan. Java hanya menyiapkan ruang kosong untuk 4 baris
   × 2 kolom, tetapi tidak memaksa kamu untuk mengisi elemen secara berurutan.
2. Karena String adalah reference type (bukan tipe primitif). Kalau belum diberi nilai, referensi
   tersebut menunjuk ke “tidak ada objek”, yaitu null.
3. modifikasi
4. penonton.length digunakan untuk mengetahui jumlah baris pada array 2 dimensi. 
   Ya, semuanya memiliki nilai yang sama (yaitu 2), Karena ketika array dibuat: new String[4][2]
   Java membuat struktur 4 baris dan setiap baris memiliki 2 kolom
5. modif done
6. modif done
7. modif done
8. modif done
9. modif done
10. foreach loop lebih sederhana dan mudah dibaca karena tidak perlu memasukkan index,kondisi dan
    increment dan cocok untuk membaca semua elemen sedangkan kekurangannya adalah dalam foreach kita tidak tahu elemen ke berapa yang sedang diakses,tidak cocok untuk mengubah nilai array dan tidak bisa melompati elemen tertentu seperti continue dan break.
11. Indeks baris maksimal untuk array penonton adalah 3
12. Indeks kolom maksimal untuk array penonton adalah 1 
13. String.join() adalah metode di Java yang digunakan untuk menggabungkan beberapa string menjadi satu
   string, dengan pemisah (delimiter) tertentu di antara tiap elemen.