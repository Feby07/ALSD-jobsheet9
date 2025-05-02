import java.util.Scanner;

public class SuratDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat07 stackSurat = new StackSurat07(10); 
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat          : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa    : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas             : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I)  : ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi (hari)      : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat07 surat = new Surat07(id, nama, kelas, jenisIzin, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat izin telah diterima.");
                    break;
                case 2:
                    stackSurat.prosesSurat();
                    break;
                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat izin: ");
                    String namaCari = sc.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;
                case 0:
                    System.out.println("Terima kasih! Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
