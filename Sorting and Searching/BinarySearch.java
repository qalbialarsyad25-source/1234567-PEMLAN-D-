import java.util.*;

class Pemain
{
    int tinggi, berat;
    public Pemain(int tinggi, int berat){
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString(){
        return this.tinggi + " " + this.berat;
    }
}

class SortTallAscending implements Comparator<Pemain>
{
    public int compare(Pemain a, Pemain b){
        return a.tinggi - b.tinggi;
    }
}

class SortWeightAscending implements Comparator<Pemain>
{
    public int compare(Pemain a, Pemain b){
        return a.berat - b.berat;
    }
}

public class BinarySearch {
    public static void main (String [] args){
        ArrayList<Pemain> a = new ArrayList<Pemain>();
        ArrayList<Pemain> b = new ArrayList<Pemain>();
        a.add(new Pemain(168, 50));
        a.add(new Pemain(170, 60));
        a.add(new Pemain(165, 56));
        a.add(new Pemain(168, 55));
        a.add(new Pemain(172, 60));
        a.add(new Pemain(170, 70));
        a.add(new Pemain(169, 66));
        a.add(new Pemain(165, 56));
        a.add(new Pemain(171, 72));
        a.add(new Pemain(166, 56));

        b.add(new Pemain(170, 66));
        b.add(new Pemain(167, 60));
        b.add(new Pemain(165, 59));
        b.add(new Pemain(166, 58));
        b.add(new Pemain(168, 58));
        b.add(new Pemain(175, 71));
        b.add(new Pemain(172, 68));
        b.add(new Pemain(171, 68));
        b.add(new Pemain(168, 65));
        b.add(new Pemain(169, 60));

        Collections.sort(b, new SortTallAscending());

        int cari = 168;
        int respon = Collections.binarySearch(b, new Pemain(cari, 0), new SortTallAscending());
        if (respon >= 0){
            System.out.println(cari + " Ditemukan pada index : " + respon);
        } else {
            System.out.println(cari + " Tidak ditemukan");
        }

        cari = 160;
        respon = Collections.binarySearch(b, new Pemain(cari, 0), new SortTallAscending());
        if (respon >= 0){
            System.out.println(cari + " Ditemukan pada index : " + respon);
        } else {
            System.out.println(cari + " Tidak ditemukan");
        }
        
        System.out.println();
        Collections.sort(a, new SortWeightAscending());

        cari = 56;
        respon = Collections.binarySearch(a, new Pemain(0, cari), new SortWeightAscending());
        if (respon >= 0){
            System.out.println(cari + " Ditemukan pada index : " + respon);
        } else {
            System.out.println(cari + " Tidak ditemukan");
        }

        cari = 53;
        respon = Collections.binarySearch(a, new Pemain(0, cari), new SortWeightAscending());
        if (respon >= 0){
            System.out.println(cari + " Ditemukan pada index : " + respon);
        } else {
            System.out.println(cari + " Tidak ditemukan");
        }

        ArrayList<Integer> tinggiA = new ArrayList<Integer>();
        ArrayList<Integer> tinggiB = new ArrayList<Integer>();

        ArrayList<Integer> beratA = new ArrayList<Integer>();
        ArrayList<Integer> beratB = new ArrayList<Integer>();

        for (Pemain p : a) {
            tinggiA.add(p.tinggi);
            beratA.add(p.berat);
        }

        for (Pemain p : b) {
            tinggiB.add(p.tinggi);
            beratB.add(p.berat);
        }

        tinggiA.retainAll(tinggiB);
        beratA.retainAll(beratB);

        if (!Collections.disjoint(tinggiA, tinggiB)) {
            System.out.println("\nAda tinggi badan yang sama " + tinggiA);
        } else {
            System.out.println("Tidak ada tinggi badan yang sama");
        }

        if (!Collections.disjoint(beratA, beratB)) {
            System.out.println("Ada berat badan yang sama " + beratA);
        } else {
            System.out.println("Tidak ada berat badan yang sama");
        }


    }
}
