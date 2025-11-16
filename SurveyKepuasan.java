import java.util.Scanner;

public class SurveyKepuasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Baris = 10 respond, Kolom = 6 question
        int[][] survey = new int[10][6];

        // Input Data Survey
        System.out.println("=== Input Hasil Survey Kepuasan Pelanggan ===");
        for (int i = 0; i < survey.length; i++) { // survey.length = jumlah baris
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survey[0].length; j++) { // survey[0].length = jumlah kolom
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Rata-rata per responden
        System.out.println("=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < survey.length; i++) {
            double total = 0;
            for (int j = 0; j < survey[0].length; j++) {
                total += survey[i][j];
            }
            double rata = total / survey[0].length;
            System.out.printf("Responden %d : %.2f\n", (i + 1), rata);
        }

        // Rata-rata per pertanyaan
        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < survey[0].length; j++) {
            double total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            double rata = total / survey.length;
            System.out.printf("Pertanyaan %d : %.2f\n", (j + 1), rata);
        }

        // Rerata All
        double totalKeseluruhan = 0;
        int jumlahData = survey.length * survey[0].length;

        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[0].length; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        double rataKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.printf("\n=== Rata-rata Keseluruhan ===\nKeseluruhan : %.2f\n", rataKeseluruhan);
    }
}