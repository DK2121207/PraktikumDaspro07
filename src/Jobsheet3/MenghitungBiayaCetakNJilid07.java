package Jobsheet3;

import java.util.Scanner;

public class MenghitungBiayaCetakNJilid07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        int biayaCetak = 500, biayaJilid = 5000, banyakLembar, harga;
        System.out.print("Masukkan jumlah lembar: ");
        banyakLembar = davin.nextInt();
        harga = banyakLembar * biayaCetak + biayaJilid;

        System.out.println("Biaya mencetak sekaligus menjilid adalah Rp. " + harga);
    }
}
