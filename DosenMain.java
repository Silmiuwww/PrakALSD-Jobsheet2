import java. util. Scanner;
public class DosenMain {
    public static void main(String[] args) {
       
        Dosen dosen1 = new Dosen("D001", "Dr. Alfarizi", true, 2010, "Machine Learning");
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Matematika");

        dosen1.tampilInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");

        Dosen dosen2 = new Dosen();
        dosen2.tampilInformasi();

        dosen2.idDosen = "D002";
        dosen2.nama = "Dr. Siti Nurmaini";
        dosen2.statusAktif = true;
        dosen2.tahunBergabung = 2015;
        dosen2.bidangKeahlian = "Basis Data";

        dosen2.tampilInformasi();
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
