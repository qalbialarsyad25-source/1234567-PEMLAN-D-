public class Employee implements Payable {
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(int reg, String name, int salary, Invoice[] invoices) {
        this.registrationNumber = reg;
        this.name = name;
        this.salaryPerMonth = salary;
        this.invoices = invoices;
    }

    public double getTotalInvoice() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void display() {
        System.out.println("ID: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji Awal: " + salaryPerMonth);

        System.out.println("\nDetail Belanja:");
        for (Invoice inv : invoices) {
            inv.display();
        }

        System.out.println("Total Belanja: " + getTotalInvoice());
        System.out.println("Gaji Setelah Potong: " + getPayableAmount());
    }
}