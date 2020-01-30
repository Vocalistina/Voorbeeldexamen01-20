public class Deodorant extends Product {
    private DeoType soort;
    public Deodorant(int productNummer, String merk, String naam, int volume, double prijs, DeoType soort) {
        super(productNummer, merk, naam, volume, prijs);
        this.soort = soort;
    }

    public DeoType getSoort() {
        return this.soort;
    }

    @Override
    public String toString() {
        StringBuilder maakNieuweOutput = new StringBuilder();
        maakNieuweOutput.append(super.toString());
        maakNieuweOutput.append(" ");
        maakNieuweOutput.append(this.getSoort());
        String printOutput = maakNieuweOutput.toString();
        return printOutput;
    }
}
