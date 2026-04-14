public class KreditCard implements MetodeBayar {
    
    @Override
    public void proses(int jumlah){
        System.out.println("bayar"+jumlah+"menggunakan kredit card");
    }
}
