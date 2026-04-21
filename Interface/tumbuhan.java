public class tumbuhan implements MahlukHidup, Identitas {
    private String nama;
    private String warna;
    private int umur;
    private String makan;


    public tumbuhan(String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    @Override
    public void tampilkanNama(){
        System.out.println("Nama tumbuhan : " + this.nama);
    }

    @Override
    public void tampilkanUmur(){
        System.out.println("Umur tanaman : " + this.umur);
    }

    @Override
    public void warna(){
        System.out.println("Warna tumbuhan : " + this.warna);
    }

    @Override
    public void makan() {
        System.out.println("Makanan tumbuhan adalah cahaya dan CO2");
    }

    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak berjalan");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Suaranya tidak dapat didengar secara langsung" );
    
    }
}
