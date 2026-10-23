// tarif per jam kode 1 = 5000 + (7 mod 4) * 1000 = 8000
// tarif per jam kode 2 = 12000 + (7 mod 4) * 1000 = 15000
// tarif per jam kode 3 = 8000 + (7 mod 4) * 1000 = 11000
// B = banyak jam pertama yang dikenai biaya penuh = 3 + (7 mod 3) = 4
// s = banyak syarat diskon = 6 + (7 mod 3) = 7
package Ujian;

import java.util.Scanner;

public class SepedaKampus_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kode, lamaSewaDalamJam, lamaSewaSetengahBiaya, tarifPerJam, biayaDasar = 0,  B = 4, S = 7;
        String statusPenyewa;
        double diskon = 0.1 ,totalBiaya = 0;
        
        System.out.print("Masukkan kode sepeda (1/2/3): ");
        kode = sc.nextInt();
        System.out.print("Masukkan lama sewa (1-12 jam): ");
        lamaSewaDalamJam = sc.nextInt();
        System.out.print("Masukkan status penyewa (Mahasiswa/Lainnya): ");
        sc.nextLine();
        statusPenyewa = sc.nextLine().trim();
        
        if (lamaSewaDalamJam < 0 || lamaSewaDalamJam > 12) {
            System.out.println("Input tidak valid");
            return;
        }
        if (kode < 1 || kode > 3) {
            System.out.println("Kode tidak dikenal");
            return;
        }

        switch (kode) {
            case 1:
                tarifPerJam = 8000;
                lamaSewaSetengahBiaya = lamaSewaDalamJam - B;
                if (lamaSewaSetengahBiaya < 0) {
                    lamaSewaSetengahBiaya = 0;
                }
                if (lamaSewaDalamJam > B) {
                    biayaDasar += B * tarifPerJam;
                    biayaDasar += (lamaSewaDalamJam - B) * tarifPerJam/2;
                } else {
                    biayaDasar += lamaSewaDalamJam * tarifPerJam;
                }
                if (lamaSewaDalamJam >= S) {
                    totalBiaya = biayaDasar - biayaDasar * diskon;
                } else {
                    totalBiaya = biayaDasar;
                }
                break;
                case 2:
                    tarifPerJam = 15000;
                    lamaSewaSetengahBiaya = lamaSewaDalamJam - B;
                    if (lamaSewaSetengahBiaya < 0) {
                        lamaSewaSetengahBiaya = 0;
                    }
                    if (lamaSewaDalamJam > B) {
                        biayaDasar += B * tarifPerJam;
                        biayaDasar += (lamaSewaDalamJam - B) * tarifPerJam/2;
                    } else {
                        biayaDasar += lamaSewaDalamJam * tarifPerJam;
                    }
                    if (lamaSewaDalamJam >= S) {
                        totalBiaya = biayaDasar - biayaDasar * diskon;
                    } else {
                        totalBiaya = biayaDasar;
                    }
                    break;
                    case 3:
                        tarifPerJam = 11000;
                        lamaSewaSetengahBiaya = lamaSewaDalamJam - B;
                        if (lamaSewaSetengahBiaya < 0) {
                            lamaSewaSetengahBiaya = 0;
                        }
                        if (lamaSewaDalamJam > B) {
                            biayaDasar += B * tarifPerJam;
                            biayaDasar += (lamaSewaDalamJam - B) * tarifPerJam/2;
                        } else {
                            biayaDasar += lamaSewaDalamJam * tarifPerJam;
                        }
                        if (lamaSewaDalamJam >= S ) {
                            totalBiaya = biayaDasar - biayaDasar * diskon;
                        } else {
                            totalBiaya = biayaDasar;
                        }
                break;
        
            default:
                break;
        }
        System.out.println("Layanan: Pinjam Sepeda Kampus");
        System.out.println("Biaya dasar: " + biayaDasar);
        System.out.println("Diskon: " + (biayaDasar * diskon));
        System.out.println("Total biaya: " + totalBiaya);
    }
}

// output
// Masukkan kode sepeda (1/2/3): 1
// Masukkan lama sewa (1-12 jam): 5
// Masukkan status penyewa (Mahasiswa/Lainnya): Mahasiswa
// Layanan: Pinjam Sepeda Kampus
// Biaya dasar: 36000
// Diskon: 3600.0
// Total biaya: 36000.0