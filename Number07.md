1. Tambahkan kode program sebagai berikut
   for (int i = 0; i < myNumbers.length; i++) {
      System.out.println(Arrays.toString(myNumbers[i]));
    }
2. Apa fungsi dari Arrays.toString()? 
3. Apa nilai default untuk elemen pada array dengan tipe data int? 
4. Tambahkan kode program berikut 
   for (int i = 0; i < myNumbers. length; i++) {
      System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
    }
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang 
   array dapat dimodifikasi setelah diinstansiasi?

Jawab : 
1. modif done
2. Fungsi Arrays.toString() adalah mengubah isi array menjadi bentuk string (teks) yang mudah dibaca, sehingga ketika array dicetak menggunakan
   System.out.println, hasilnya terlihat rapi.
3. 0 (zero)
4. modif done
5. Tidak, panjang array di Java tidak bisa diubah setelah di-instansiasi.