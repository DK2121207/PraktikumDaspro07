package Jobsheet3;

import java.util.Scanner;

public class GajiKaryawan07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        int gajiPokok;
        double bonus, totalGaji, tunjanganTransportasi = 600000, tunjanganMakan = 400000;

        gajiPokok = davin.nextInt();
        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - 0.1 * gajiPokok;

        System.out.println("Bonus bulanan anda Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) totalGaji);
    }
}
