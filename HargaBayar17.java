import java.util.Scanner;

public class HargaBayar17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi Variabel
        int harga, jumlah, halamanBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        //input
        System.out.println("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.println("Masukkan Merk Buku");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku : ");
        halamanBuku = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah = input.nextInt();
        System.out.println("Masukkan besaran diskon : ");
        dis = input.nextDouble();

        //Perhitungan total belanja
        total = harga* jumlah;

        //Perhitungan jumlah diskon
        jmlDis = total * dis;

        //Perhitungan bayar
        bayar = total - jmlDis;

        //Menampilkan isi variabel jmlDis dan bayar
        System.out.println("Diskon yang didapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adlah : " + bayar);
        

    }
}
