public class Manusia{
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(){

    }

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public String getNik(){
        return nik;
    }

    public String getNama(){
        return nama;
    }

    public boolean getJenisKelamin(){
        return jenisKelamin;
    }

    public boolean getMenikah(){
        return menikah;
    }

    public double getPendapatan(){
        double pendapatan = 0;
        return pendapatan;
    }
    
    public double getTunjangan(){
        double tunjangan = 0;
            if (this.menikah && this.jenisKelamin){
                return tunjangan = 25;
            } else if (this.menikah){
                return tunjangan = 20;
            }
            return tunjangan = 15;
    }

    @Override
    public String toString(){
        return String.format(
            "Nama           : %s\n" +
            "NIK            : %s\n" +
            "JenisKelamin   : %s\n" +
            "Menikah        : %s\n" +
            "Pendapatan     : $%.2f",
            nama, nik,
            jenisKelamin ? "Laki-Laki" : "Perempuan",
            menikah ? "Sudah" : "Belum",
            getTunjangan() + getPendapatan()
        );
    }
}