import java.util.Scanner;

public class KategoriUsia20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");
        if (input.hasNextInt()) {
            int usia = input.nextInt();
            if (usia < 0) {
                System.out.println("Error: Usia tidak valid! Usia harus berupa angka positif.");
            } else {
                String kategori;
                if (usia <= 12) {
                    kategori = "Anak";
                } else if (usia <= 19) {
                    kategori = "Remaja";
                } else if (usia <= 64) {
                    kategori = "Dewasa";
                    } else {
                    kategori = "Lansia";
                }
                System.out.println("Kategori usia Anda: " + kategori);
            }
        } else {
            System.out.println("Error: Input tidak valid! Harap masukkan angka bulat.");
        }
        input.close();
    }
}