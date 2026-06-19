package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) throws IOException {
        // Parameter true berarti menambah (append), bukan menimpa
        try (PrintWriter hari = new PrintWriter(new FileWriter("hari.txt", true)))
{
            hari.println("Sabtu");
            hari.println("Minggu");
            System.out.println("Menambahkan Dua Hari Sabtu dan Minggu");
            
            System.out.println("Isi File hari.txt");
        
        try (BufferedReader membaca = new BufferedReader(new FileReader("hari.txt"))){
            
            String baris;
            while ((baris = membaca.readLine()) != null) {
                System.out.println(baris);
        }
            
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
}
    }
}
