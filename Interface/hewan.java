

public class hewan implements MahlukHidup, Identitas {
    private String alat;
    private int kaki;
    private String suara;
    private String nama;
    private int umur;
    private String warna;

    public hewan(String alat, int kaki, String suara, String nama, int umur, String warna){
        this.alat = alat;
        this.kaki = kaki;
        this.suara = suara;
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
    }
    
    @Override
    public void makan() {
        System.out.println("Makan pakai " + this.alat);
    }
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai " + this.kaki + " kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya " + this.suara);
    }

    @Override
    public void tampilkanNama (){
        System.out.println("Nama hewa : " + this.nama);
    }

    @Override
    public void tampilkanUmur (){
        System.out.println("Umur hewan : " + this.umur);
    }

    @Override
    public void warna(){
        System.out.println("kulit hewan : " + this.warna);
    }
}