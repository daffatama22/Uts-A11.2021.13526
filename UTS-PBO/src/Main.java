import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilih;
        System.out.print("Masukan Jumlah Mahasiswa");
        int JumlahMahasiswa = input.nextInt();

        while(true){
            System.out.println("1. Mahasiswa Aktif");
            System.out.println("2. Mahasiswa Baru");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("Pilih nomor :");
            pilih = input.nextInt();
            if(pilih == 2){
                System.out.println("1 . Mahasiswa Baru");
                System.out.println("2 . Mahasiswa Transfer");
                pilih = input.nextInt(); 
                if(pilih == 1){
                    pilih = 2;
                }
                else if(pilih == 2){
                    pilih = 4;
                }
            }
            switch(pilih){
            case 1:
                for(int i = 0;i < JumlahMahasiswa; i++){
                    Mahasiswa mahasiswa = new Mahasiswa();
                    System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                    System.out.println("Nama :");
                    mahasiswa.nama = input.next();
                    System.out.println("NIM :");
                    mahasiswa.nim = input.next();
                    System.out.println("Semester :");
                    mahasiswa.semester = input.nextInt();
                    System.out.println("Usia :");
                    mahasiswa.usia = input.nextInt();
                    mahasiswa.inputKrs();
                    mahasiswa.rataNilai();
                    daftarMahasiswa.add(mahasiswa);
                }
                break;
            case 2 :
                for(int i = 0;i < JumlahMahasiswa; i++){
                    Mahasiswa mhsBaru = new MahasiswaBaru();
                    System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                    System.out.println("Nama :");
                    mhsBaru.nama = input.next();
                    System.out.println("NIM :");
                    mhsBaru.nim = input.next();
                    System.out.println("Semester :");
                    mhsBaru.semester = input.nextInt();
                    System.out.println("Usia :");
                    mhsBaru.usia = input.nextInt();
                    System.out.println("Asal Sekolah :");
                    mhsBaru.asalSekolah = input.next();
                    mhsBaru.inputKrs();
                    mhsBaru.rataNilai();
                    daftarMahasiswa.add(mhsBaru);
                }
                break;
            case 3 :
                for(int i = 0;i < JumlahMahasiswa; i++){
                    Mahasiswa mhsLulus = new MahasiswaLulus();
                    System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                    System.out.println("Nama :");
                    mhsLulus.nama = input.next();
                    System.out.println("NIM :");
                    mhsLulus.nim = input.next();
                    System.out.println("Semester :");
                    mhsLulus.semester = input.nextInt();
                    System.out.println("Usia :");
                    mhsLulus.usia = input.nextInt();
                    System.out.println("Tahun Masuk :");
                    mhsLulus.tahunWisuda = input.nextInt();
                    mhsLulus.inputKrs();
                    mhsLulus.rataNilai();
                    daftarMahasiswa.add(mhsLulus);
                }
                break;
            case 4 :
                for(int i = 0;i < JumlahMahasiswa; i++){
                    Mahasiswa mhsTransfer = new MahasiswaTransfer();
                    System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                    System.out.println("Nama :");
                    mhsTransfer.nama = input.next();
                    System.out.println("NIM :");
                    mhsTransfer.nim = input.next();
                    System.out.println("Semester :");
                    mhsTransfer.semester = input.nextInt();
                    System.out.println("Usia :");
                    mhsTransfer.usia = input.nextInt();
                    System.out.println("Asal Universitas :");
                    mhsTransfer.asalUniv = input.next();
                    mhsTransfer.inputKrs();
                    mhsTransfer.rataNilai();
                    daftarMahasiswa.add(mhsTransfer);
                }
                break;

            }
            for (int i = 0; i < daftarMahasiswa.size(); i++){
                System.out.println("\nData Mahasiswa ke " + (i+1) + "-");
                daftarMahasiswa.get(i).infoMahasiswa();
                daftarMahasiswa.get(i).infoKrsMahasiswa();
            }
        }
    }
}
