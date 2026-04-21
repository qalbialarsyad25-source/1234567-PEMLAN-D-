import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama hewan : ");
        String namahewan = input.nextLine();
        System.out.println("Masukkan umur hewan : ");
        int umurhewan = input.nextInt();
        System.out.println("Masukkan alat makan hewan : ");
        input.nextLine();
        String alathewan = input.nextLine();
        System.out.println("Jenis suara hewan : ");
        String suarahewan = input.nextLine();
        System.out.println("Masukkan warna kulit hewan : ");
        String warnahewan = input.nextLine();
        System.out.println("Jumlah kaki hewan : ");
        int kakihewan = input.nextInt();
        hewan h1 = new hewan(alathewan, kakihewan, suarahewan, namahewan, umurhewan, warnahewan);
        input.nextLine();

        System.out.println("Masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("Masukkan umur anda : ");
        int umur = input.nextInt();
        System.out.println("Masukkan alat makan : ");
        input.nextLine();
        String alat = input.nextLine();
        System.out.println("Jenis suara anda : ");
        String suara = input.nextLine();
        System.out.println("Masukkan warna kulit anda : ");
        String warna = input.nextLine();


        manusia b = new manusia(nama, umur, alat, suara, warna);

        System.out.println("Masukkan nama tanaman : ");
        String namatumbuhan = input.nextLine();
        System.out.println("Masukkan umur tanaman : ");
        int umurtumbuhan = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan warna tumbuhan : ");
        String warnatumbuhan = input.nextLine();

        tumbuhan c = new tumbuhan(namatumbuhan, warnatumbuhan, umurtumbuhan);


        // method dari interface MahlukHidup
        h1.makan();
        h1.berjalan();
        h1.bersuara();
        h1.tampilkanNama();
        h1.tampilkanUmur();
        System.out.println();

        //method dari interface manusia
        b.makan();
        b.berjalan();
        b.bersuara();
        b.tampilkanNama();
        b.tampilkanUmur();
        System.out.println();

        c.makan();
        c.berjalan();
        c.bersuara();
        c.tampilkanNama();
        c.tampilkanUmur();
        c.warna();
        System.out.println();
    }
}