
import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }

    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }

    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){
        LocalDate tahunSekarang = LocalDate.now();
        int lamaBekerja = tahunSekarang.getYear() - tahunMasuk.getYear();
            if (lamaBekerja >= 0 && lamaBekerja <= 5){
                return (0.05 * gaji) + (jumlahAnak * 20);
            } else if (lamaBekerja >= 5 && lamaBekerja <= 10){
                return (0.1 * gaji) + (jumlahAnak * 20);
            } else if (lamaBekerja >= 10){
                return (0.15 * gaji) + (jumlahAnak * 20);
            }
        return gaji + (jumlahAnak * 20);
    }

    @Override
    public String toString(){
         return String.format(
        "\nNama           : %s\n" +
        "NIK            : %s\n" +
        "JenisKelamin   : %s\n" +
        "Menikah        : %s\n" +
        "Tahun Masuk    : %s\n" +
        "Jumlah Anak    : %s\n" +
        "Pendapatan     : $%.2f\n" +
        "Gaji           : $%.2f",
        getNama(),
        getNik(),
        getJenisKelamin() ? "Laki-Laki" : "Perempuan",
        getMenikah() ? "Sudah" : "Belum",
        getTahunMasuk(),
        getJumlahAnak(),
        getGaji()+super.getTunjangan() + getBonus(),
        getGaji()
    );
    }
}
