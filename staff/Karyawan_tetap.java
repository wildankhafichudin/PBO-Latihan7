package staff;

public class Karyawan_tetap extends Karyawan  {
    double tunjanganAnak;

    public Karyawan_tetap(String nama, String jabatan, double gajiPokok, double tunjangan, double tunjanganAnak) {
        super(nama, jabatan, gajiPokok, tunjangan);
        this.tunjanganAnak = tunjanganAnak;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public double hitungTotalGaji() {
        return getGajiPokok() + getTunjangan() + tunjanganAnak;
    }

    public static void main(String[] args) {
        Karyawan_tetap karyawan = new Karyawan_tetap("Fifi", "Karyawan Tetap", 5000000, 1000000, 500000);
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        System.out.println("Gaji Pokok: " + karyawan.getGajiPokok());
        System.out.println("Tunjangan: " + karyawan.getTunjangan());
        System.out.println("Tunjangan Anak: " + karyawan.getTunjanganAnak());
        System.out.println("Total Gaji: " + karyawan.hitungTotalGaji());
    }
}
