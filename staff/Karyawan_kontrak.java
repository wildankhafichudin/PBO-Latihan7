package staff;

public class Karyawan_kontrak extends Karyawan {
    double upahHarian;
    int jumlahHariMasuk;

    public Karyawan_kontrak(String nama, String jabatan, double upahHarian, int jumlahHariMasuk) {
        super(nama, jabatan, 0, 0);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getTotalUpah() {
        double tunjanganAnak = getTunjangan();
        double totalUpah = upahHarian * jumlahHariMasuk + tunjanganAnak;
        return totalUpah;
    }

    public static void main(String[] args) {
        Karyawan_kontrak karyawan = new Karyawan_kontrak("Toni", "Karyawan Kontrak", 200000, 20);
        karyawan.setTunjangan(100000);
        double totalUpah = karyawan.getTotalUpah();
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        System.out.println("Total Upah: " + totalUpah);
    }
}