package Jobsheet2;

import java.util.Scanner;

public class StudiKasus107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok, tunjanganPerAnak, jumlahAnak;
        double potonganGajiPokok = 0.9, gajiBersih;
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan tunjangan per anak: ");
        tunjanganPerAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();
        gajiBersih = tunjanganPerAnak * jumlahAnak + gajiPokok * potonganGajiPokok;

        System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
    }
}
