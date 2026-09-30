package Jobsheet3;

import java.util.Scanner;

public class MenghitungCicilanPerBulan07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        int hargaBarang, uangMuka, lamaBulan;
        double bunga = 0.02, besarBunga, cicilanPerBulan;

        System.out.print("Masukkan harga barang: ");
        hargaBarang = davin.nextInt();
        System.out.print("Masukkan uang muka: ");
        uangMuka = davin.nextInt();
        System.out.print("Masukkan lama cicilan dalam bulan: ");
        lamaBulan = davin.nextInt();
        hargaBarang -= uangMuka;
        // besarBunga = hargaBarang * bunga * lamaBulan;
        // besarBunga = hargaBarang / lamaBulan * bunga;
        besarBunga = hargaBarang * bunga;
        cicilanPerBulan = hargaBarang / lamaBulan + besarBunga;

        System.out.printf("Cicilan yang harus anda bayar per bulan selama %d adalah Rp. %,.5f", lamaBulan, cicilanPerBulan);
    }
}
