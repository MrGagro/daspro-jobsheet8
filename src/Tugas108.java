import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int totalSemua = 0;

        for(int i = 1; i <= n; i++) {
            int totalAngka = 0;
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
                totalAngka ++;
            }
        totalSemua += totalAngka;
        System.out.println();
        }
        System.out.println("Total angka tercetak: " + totalSemua);
        sc.close();
    }
}
