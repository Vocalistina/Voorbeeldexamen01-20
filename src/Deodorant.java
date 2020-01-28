public class Deodorant extends Product {
    DeoType soort;
    public Deodorant(int productNummer, String merk, String naam, int volume, double prijs) {
        super(productNummer, merk, naam, volume, prijs);
    }

    public DeoType getSoort() {
        return soort;
    }

    @Override
    public String toString() {
        StringBuilder maakNieuweOutput = new StringBuilder();
        maakNieuweOutput.append(super.toString());
        maakNieuweOutput.append(this.soort);
        String printOutput = maakNieuweOutput.toString();
        return printOutput;
    }
}
