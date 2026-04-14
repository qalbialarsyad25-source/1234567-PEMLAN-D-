
public class main {
    public static void main(String[]args){

        MetodeBayar[] daftarHarga = new MetodeBayar[2];

        daftarHarga[0] = new Qris();
        daftarHarga[1] = new KreditCard();

        for(int i = 0; i < daftarHarga.length; i++){
            daftarHarga[i].proses(50000);
        }
    }
}