package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) throws IOException{

        try(PrintWriter hari = new PrintWriter(new FileWriter("hari.txt"))){
            hari.println("Senin");
            hari.println("Selasa");
            hari.println("Rabu");
            hari.println("Kamis");
            hari.println("Jumat");
        } catch (IOException e){
            System.out.println("Gagal menambah hari : " + e.getMessage() );
        }
        
        System.out.println("Isi File hari.txt");
        
        try (BufferedReader membaca = new BufferedReader(new FileReader("hari.txt"))){
            
            String baris;
            while ((baris = membaca.readLine()) != null) {
                System.out.println(baris);
        }
            } catch (IOException e){
                System.out.println("Gagal membaca : " + e.getMessage());
        }   
   
    }
}
