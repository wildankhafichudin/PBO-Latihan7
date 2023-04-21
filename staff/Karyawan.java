package staff;

public class Karyawan {
     String nama;
     String jabatan;
     double gajiPokok;
     double tunjanganAnak;

    public Karyawan(String nama, String jabatan, double gajiPokok, double tunjanganAnak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjanganAnak;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjanganAnak = tunjangan;
    }


    public double hitungTotalGaji(int jumlahHariMasuk) {
        double upahHarian = gajiPokok / 30;
        double totalUpah = upahHarian * jumlahHariMasuk;
        totalUpah += tunjanganAnak;
        return totalUpah;
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Jimmy", "Manager", 5000000, 1000000);
        double totalGajiKaryawan1 = karyawan1.hitungTotalGaji(25);
        System.out.println("Total gaji karyawan 1: " + totalGajiKaryawan1);
    }
}