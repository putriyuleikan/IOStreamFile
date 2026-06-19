package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) throws IOException {
    String namaFile = "sementara.txt";

        File berkas = new File(namaFile);

        berkas.createNewFile();
 
        if (berkas.exists())
            System.out.println("Berkas sementara.txt ada");

        berkas.delete();
        System.out.println("Setelah berkas dihapus");

        if (berkas.exists())System.out.println("Berkas " + namaFile + " ada");
        else System.out.println("Berkas " + namaFile + " sudah dihapus");
        
    }
}