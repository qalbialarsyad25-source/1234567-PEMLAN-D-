public class Qris implements MetodeBayar {

    @Override
    public void proses(int jumlah){
        System.out.println("bayar"+jumlah+"mwnggunakan QRIS");
    }
}
