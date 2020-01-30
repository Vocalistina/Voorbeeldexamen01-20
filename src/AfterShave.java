public class AfterShave extends Product {
    DeoType soort;
    public AfterShave(int productNummer, String merk, String naam, int volume, double prijs, DeoType soort) {
        super(productNummer, merk, naam, volume, prijs);
    }

    public DeoType getSoort() {
        return soort;
    }

    @Override
    public String toString() {
        StringBuilder maakNieuweOutput = new StringBuilder();
        maakNieuweOutput.append(super.toString());
        maakNieuweOutput.append(" ");
        maakNieuweOutput.append(this.soort);
        String printOutput = maakNieuweOutput.toString();
        return printOutput;
    }
}
