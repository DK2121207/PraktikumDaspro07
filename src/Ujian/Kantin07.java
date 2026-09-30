package Ujian;

import java.util.Scanner;

public class Kantin07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        double harga = 8500, modal = 1201250, kas, pendapatan, laba, bagianPetugas;
        int jumlahPorsiTerjual, jumlahPetugas = 4;
        
        System.out.print("Masukkan jumlah porsi terjual: ");
        jumlahPorsiTerjual = davin.nextInt();
        pendapatan = jumlahPorsiTerjual * harga;
        if (jumlahPorsiTerjual > 141 || jumlahPorsiTerjual < 0) {
            System.out.println("Input tidak masuk akal");
            return;
        }
        laba = modal - pendapatan;
        kas = laba % jumlahPetugas;
        bagianPetugas = laba / jumlahPetugas;

        System.out.println("Pendapatan\t: " + (int) pendapatan);
        System.out.println("Laba\t\t: " + (int) laba);
        System.out.println("Bagian petugas\t: " + bagianPetugas);
        System.out.println("Sisa kas\t: " + (int) kas);
        
    }
}
// Masukkan jumlah porsi terjual: 5
// Pendapatan      : 42500
// Laba            : 1158750
// Bagian petugas  : 289687.5
// Sisa kas        : 2