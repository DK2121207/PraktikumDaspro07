// Nomor absen = 7
// tarif parkir mobil = 2500 + (7 % 6) * 250 = 2750
// tarif parkir motor = 1500 + (7 % 6) * 250 = 1750
package Pertemuan9;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Masukkan jenis kendaraan (1/2): ");
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi*(2500 + (7 % 6) * 250);
                    // 2500 + (7 % 6) * 250 = 2750
                } else {
                    total += durasi*(1500 + (7 % 6) * 250);
                    // 1500 + (7 % 6) * 250 = 1750
                }
            }
        } while (jenis != 0);
        System.out.println("Total biaya parkir" + total);
    }
}
