import java.lang.*;
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

class SortTallDescending implements Comparator<Pemain>
{
    public int compare(Pemain a, Pemain b){
        return b.tinggi - a.tinggi;
    }
}

public class Urutan {
    public static void main (String [] args){
        ArrayList<Pemain> a = new ArrayList<Pemain>();
        ArrayList<Pemain> b = new ArrayList<Pemain>();
        ArrayList<Pemain> c = new ArrayList<Pemain>();
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

        Collections.sort(a, new SortTallAscending());
        System.out.println("Ascending Tim A");
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }

        Collections.sort(a, new SortTallDescending());
        System.out.println("\nDescending Tim A");
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        
        System.out.println("\nTinggi Maksimum : " + a.get(0).tinggi);
        System.out.println("Tinggi Minimum : " + a.get(a.size()-1).tinggi);

        Collections.sort(b, new SortTallAscending());
        System.out.println("\nAscending Tim B");
        for (int i = 0; i < b.size(); i++){
            System.out.println(b.get(i));
        }

        Collections.sort(b, new SortTallDescending());
        System.out.println("\nDescending Tim B");
        for (int i = 0; i < b.size(); i++){
            System.out.println(b.get(i));
        }
        
        System.out.println("\nTinggi Maksimum : " + b.get(0).tinggi);
        System.out.println("Tinggi Minimum : " + b.get(b.size()-1).tinggi);

        for (int i = 0; i < b.size(); i++) {
            c.add(null);
        }

        Collections.copy(c, b);

        System.out.println("\nData Tim C");

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}
