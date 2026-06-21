//Putri Ayu Lestari
//2410010225
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Elektronik"
        };

        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat berkas
        Gudang gudang = new Gudang("barang.txt");

        // 5 objek barang
        gudang.tambahBarang(
                new Barang("Beras", 50000, 10));

        gudang.tambahBarang(
                new Barang("Gula", 18000, 5));

        gudang.tambahBarang(
                new Barang("Teh", 5000, 15));

        gudang.tambahBarang(
                new Barang("Lampu", 25000, 10));

        gudang.tambahBarang(
                new Barang("Baterai", 4000, 20));

        // menampilkan data
        gudang.tampilkanSemua();

        System.out.println("Total Nilai Persediaan: Rp"
                + gudang.totalNilai());

        // menyimpan ke berkas
        gudang.simpanBerkas();

        System.out.println();

        // Muat ulang dari berkas
        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println("Total Nilai Persediaan Setelah Dimuat: Rp"
                + gudangBaru.totalNilai());
    }
}