public class Main {
    public static void main(String[] args) {

        BujurSangkar bujurSangkar = new BujurSangkar(5, "Merah");
        bujurSangkar.printInfo();

        Lingkaran lingkaran = new Lingkaran(7, "Biru");
        lingkaran.printInfo();

        Silinder silinder = new Silinder(10, 7, "Hijau");
        silinder.printInfo();
    }
}