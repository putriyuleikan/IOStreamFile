package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
       
        String namaDir = "arsip";
        File dir = new File (namaDir);
        
        if (dir.mkdir()){
            System.out.println("Folder berhasil dibuat : ");
        } else{
            System.out.println("Folder gagal dibuat :(");
        }
    }
}
