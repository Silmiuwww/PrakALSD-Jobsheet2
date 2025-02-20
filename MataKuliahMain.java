import java. util. Scanner;
public class MataKuliahMain {
    public static void main(String[] args) {
      
        MataKuliah mk1 = new MataKuliah("AL103", "Algoritma dan Pemrograman", 3, 6);
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();
        MataKuliah mk2 = new MataKuliah();
        mk2.tampilInformasi();

        mk2.kodeMK = "AL104";
        mk2.nama = "Struktur Data";
        mk2.sks = 3;
        mk2.jumlahJam = 5;

        mk2.tampilInformasi();
    }
}
