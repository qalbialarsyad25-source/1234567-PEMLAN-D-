public class mainpayable {
    public static void main(String[] args) {

        Invoice inv1 = new Invoice("Beras", 2, 50000);
        Invoice inv2 = new Invoice("Minyak", 1, 20000);

        Invoice[] daftarInvoice = {inv1, inv2};

        Employee emp = new Employee(101, "Andi", 3000000, daftarInvoice);

        Payable[] payables = new Payable[3];
        payables[0] = inv1;
        payables[1] = inv2;
        payables[2] = emp;

        System.out.println("=== Semua Data Payable ===");

        for (Payable p : payables) {
            System.out.println("Jumlah: " + p.getPayableAmount());
        }

        System.out.println("\n=== Detail Employee ===");
        emp.display();
    }
}