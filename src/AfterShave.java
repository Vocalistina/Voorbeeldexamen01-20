public class AfterShave extends Product {
    public DeoType soort;
    public AfterShave(int productNummer, String merk, String naam, int volume, double prijs, DeoType soort) {
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
