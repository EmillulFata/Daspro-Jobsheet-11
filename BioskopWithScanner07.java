import java.util.Scanner;

public class BioskopWithScanner07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int baris,kolom,menu;
    String nama,next;
    String [][] penonton = new String [4][2];

    while (true) {
    System.out.println("\n=== List Opsi ===");
    System.out.println("1. Input data penonton");
    System.out.println("2. Tampilkan daftar penonton");
    System.out.println("3. Exit");
    System.out.print("Pilih menu: ");
    menu = input.nextInt();
    input.nextLine();

    if (menu == 1 ){

      System.out.print("Masukkan Nama : ");
      nama = input.nextLine();
      System.out.print("Masukkan Baris : ");
      baris = input.nextInt();
      System.out.print("Masukkan Kolom : ");
      kolom = input.nextInt();
      input.nextLine();
      if (penonton[baris - 1][kolom - 1] != null) {

        System.out.println("Kursi sudah diisi! Silakan pilih kursi lain.");
        continue;
        }

      penonton[baris-1] [kolom-1] = nama;
      System.out.print("Input penonton lainnya? (y/n)");
      next = input.nextLine();

      if (next.equalsIgnoreCase("n")) {
        break;
      }
  } else if (menu == 2){
    
    System.out.println("\n=== Daftar Penonton ===");

    for (int i = 0; i < penonton.length; i ++) {
      for (int j = 0; j < penonton[i].length; j++) {
        if (penonton[i][j] == null) {
          System.out.print("***   ");
        } else {
          System.out.print("[" + penonton[i][j] + "]   ");
        }
      }
      System.out.println();
    }
  } else if (menu == 3) {

    System.out.println("End");
    break;

  } else {
    System.out.println("Inputan tidak valid!");
   }
  }
 }
}
