import java.util.Objects;

public abstract class Product {
    private int productNummer;
    private String merk;
    private String naam;
    private int volume;
    private double prijs;  //incl. BTW

    //CONSTRUCTOR
    public Product(int productNummer, String merk, String naam, int volume, double prijs) {
        this.productNummer = productNummer;
        this.merk = merk;
        this.naam = naam;
        this.volume = volume;
        this.prijs = prijs;
    }

    //METHODES
    public String getProductCode() {
        StringBuilder maakproductCode = new StringBuilder();
        maakproductCode.append(this.merk.substring(0, 3).toUpperCase());
        maakproductCode.append(this.naam.substring(0,3).toUpperCase());
        maakproductCode.append(this.volume);
        String productCode = maakproductCode.toString();
        for (String karakter : productCode.split("")) {
            if (karakter.equals(" ")){
                karakter = "_";
            }
        }
        return productCode;
    }

    @Override
    public String toString() {
        String printOutput = String.format("%s Merk:  %s30Naam:  %s30Volume: %10s  Prijs: %5s Code: %s15",
                this.productNummer,this.merk,this.naam,this.volume,this.prijs,getProductCode());
        return printOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNummer == product.productNummer &&
                volume == product.volume &&
                Double.compare(product.prijs, prijs) == 0 &&
                Objects.equals(merk, product.merk) &&
                Objects.equals(naam, product.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNummer, merk, naam, volume, prijs);
    }

    // GETTERS & SETTERS
    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }


}
