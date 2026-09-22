import java.util.Scanner;
public class Pemilihan2Percobaan120 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        
        int tahun = sc20.nextInt();
        
        System.out.println("Tahun yang dimasukkan adalah: " + tahun);
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + "adalah tahun kabinet.");
        } else
            System.out.println(tahun + "Bukan Tahun Kabisat.");
    }

    
}
