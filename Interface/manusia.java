public class manusia implements MahlukHidup, Identitas {
    private String nama;
    private int umur;
    private String alat;
    private String suara;
    private String warna;

    public manusia(String nama, int umur, String alat, String suara, String warna){
        this.nama = nama;
        this.umur = umur;
        this.alat = alat;
        this.suara = suara;
        this.warna = warna;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai " + this.alat);
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Suaranya " + this.suara);
    
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }

    @Override
    public void warna(){
        System.out.println("Kulit anda : " + this.warna);
    }
}