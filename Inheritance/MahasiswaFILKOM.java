

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM (String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk){
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void SetNim(String nim){
        this.nim = nim;
    }

    public void SetIpk(double ipk){
        this.ipk = ipk;
    }

    public String GetNim(){
        return nim;
    }

    public double GetIpk(){
        return ipk;
    }

    
    public double getBeasiswa(){
        if (ipk >= 3.0 && ipk <= 3.5){
            return 50;
        } else if (ipk >= 3.5 && ipk <= 4){
            return 75;
        }
        return 0;
    }

    public String getStatus(){
        String Prodi = "";
        char kodeProdi = nim.charAt(6);
        String kodeAngkatan = nim.substring(0, 2);
        switch (kodeProdi) {
            case '2':
                return Prodi = "Tehnik Informatika, 20" + kodeAngkatan;
            case '3':
                return Prodi = "Tehnik Komputer, 20" + kodeAngkatan;
            case '4':
                return Prodi = "Sistem Informasi, 20" + kodeAngkatan;
            case '6':
                return Prodi = "Pendidikan Teknologi Informasi, 20" + kodeAngkatan;
            case '7':
                return Prodi = "Teknologi Informasi, 20" + kodeAngkatan;
            default:
                return Prodi = "NIM tidak Valid";
            }
    }

    @Override
    public String toString(){
        return String.format(
        "\nNama           : %s\n" +
        "NIK            : %s\n" +
        "JenisKelamin   : %s\n" +
        "Menikah        : %s\n" +
        "NIM            : %s\n" +
        "IPK            : %.1f\n" +
        "Status         : %s\n" +
        "Beasiswa       : %.2f\n" +
        "Pendapatan     : $%.2f",
        getNama(),
        getNik(),
        getJenisKelamin() ? "Laki-Laki" : "Perempuan",
        getMenikah() ? "Sudah" : "Belum",
        nim,
        ipk,
        getStatus(),
        getBeasiswa(),
        super.getTunjangan() + getBeasiswa()
    );
    }
}
