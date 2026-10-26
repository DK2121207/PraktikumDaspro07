// Nomor absen = 7
// Jumlah mahasiswa (batas perulangan for) = 8 + (7 % 5) = 10
// Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (7 % 11) = 62
package Pertemuan9;

import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;

        for (int i = 1; i <= (8 + (7 % 5)); i++) {
            // 8 + (7 % 5) = 10

            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            // tertinggi = (nilai > tertinggi) ? nilai : tertinggi;
            // terendah = (nilai < terendah) ? nilai : terendah;
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= (55 + (7 % 11))) {
                // 55 + (7 % 11) = 62
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + mahasiswaTidakLulus);
    }
}
