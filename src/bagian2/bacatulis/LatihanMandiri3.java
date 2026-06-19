package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri3 {
        public static void main(String[] args) throws FileNotFoundException, IOException {
             
            System.out.println("Menampilkan dan Menghitung Banyak Baris pada berkas hari.txt");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                    System.out.println(nomor + ". " + baris);
                    nomor++;
        }
            } catch (IOException e) {
                System.out.println("Gagal membaca: " + e.getMessage());
            }
        int jumlahBaris = 0;
             
        try (BufferedReader hitung = new BufferedReader(new FileReader("hari.txt"))) {

            while (hitung.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris dalam hari.txt = "
                    + jumlahBaris);
        }
    }
}
