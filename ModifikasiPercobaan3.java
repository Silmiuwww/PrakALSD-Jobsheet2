import java.util.Scanner;
public class ModifikasiPercobaan3 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public ModifikasiPercobaan3() {
        this.nim = "Belum diisi";
        this.nama = "Belum diisi";
        this.kelas = "Belum diisi";
        this.ipk = 0.0;
    }

    public ModifikasiPercobaan3(String nama, String nim, double ipk, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println();
    }

    void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    public static void main(String[] args) {
       
        ModifikasiPercobaan3 mhs1 = new ModifikasiPercobaan3("Nadia Salma", "244107060141", 3.7, "SIB 1A");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SIB 1B");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        ModifikasiPercobaan3 mhs2 = new ModifikasiPercobaan3("Annisa Nabila", "244107060145", 3.5, "TI 2A");
        mhs2.tampilkanInformasi();
    }
}
