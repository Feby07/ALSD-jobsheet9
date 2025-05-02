public class Surat07 {
    String idsurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat07(String idsurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idsurat = idsurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("ID Surat        : " + idsurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis Izin      : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi          : " + durasi + " hari");
    }
}
