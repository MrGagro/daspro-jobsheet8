import java.util.Scanner;

public class Tugas308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah Toko: ");
        int jmlToko = sc.nextInt();

        int totalSemua = 0;
        int tokoTerbanyak = 0;
        int maxBarang = -1;

        for(int t = 1; t <= jmlToko; t++) {
            System.out.print("Toko " + t + " Jumlah Pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totalBarangToko = 0;
            for(int p = 1; p <= jmlPelanggan; p++) {
                System.out.print(" pelanggan " + p + " - jumlah barang: ");
                totalBarangToko += sc.nextInt();
            }
            System.out.println("Toko " + t + " - pelanggan: " + jmlPelanggan + ", total barang: " + totalBarangToko);

            totalSemua += totalBarangToko;
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println("\nTotal barang seluruh toko: " + totalSemua);
        System.out.println("Total dengan barang terbanyak: " + tokoTerbanyak);
    }
}
