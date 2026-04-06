import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager (String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    public double getTunjangan(){
        return super.getGaji() * (10/100);
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
        "Gaji           : $%.2f\n" +
        "Departemen     : %s\n",
        getNama(),
        getNik(),
        getJenisKelamin() ? "Laki-Laki" : "Perempuan",
        getMenikah() ? "Sudah" : "Belum",
        getTahunMasuk(),
        getJumlahAnak(),
        getGaji()+super.getTunjangan() + getBonus(),
        getGaji(),
        getDepartemen()
    );
    }
}
