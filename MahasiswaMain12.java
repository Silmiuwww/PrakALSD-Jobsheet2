import java.util.Scanner;
public class MahasiswaMain12 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kinerja: " + nilaiKinerja());
        System.out.println();
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) return "Sangat Baik";
        else if (ipk >= 3.0) return "Baik";
        else if (ipk >= 2.5) return "Cukup";
        else return "Kurang";
    }

    public static void main(String[] args) {
        MahasiswaMain12 mhs1 = new MahasiswaMain12();

        mhs1.nim = "244107060141";
        mhs1.nama = "Nadia Minatul Salma";
        mhs1.kelas = "SIB-1A";
        mhs1.ipk = 3.7;

        System.out.println("Informasi Mahasiswa Sebelum Perubahan:");
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB-1B");
        mhs1.updateIpk(3.8);

        System.out.println("Informasi Mahasiswa Setelah Perubahan:");
        mhs1.tampilkanInformasi();
    }
}
