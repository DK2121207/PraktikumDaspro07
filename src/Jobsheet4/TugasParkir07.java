package Jobsheet4;

import java.util.Scanner;

public class TugasParkir07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        double lamaParkirDalamJam;
        int tarifDuaJamAwal = 2000;
        int tarifperjam = 1000;
        int tarifAkhir;

        System.out.print("Masukkan lama parkir (Jam): ");
        lamaParkirDalamJam = davin.nextDouble();

        if (lamaParkirDalamJam <= 2) {
            tarifAkhir = tarifDuaJamAwal;
        } else {
            tarifAkhir = (int) Math.ceil(lamaParkirDalamJam) * tarifperjam;
        }

        System.out.println("Traif parkir yang harus anda bayar: " + tarifAkhir);
    }
}
