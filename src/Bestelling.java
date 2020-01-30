import java.sql.Array;
import java.util.Scanner;

public class Bestelling implements Berekenbaar {
    private Product[] bestelling = new Product[100];
    private int productNummer = 1000;
    private int indexBestelling = 0;

    //METHODES
    public void voegProductToe(Product nieuwProduct) {
        if (equals(nieuwProduct)){
           System.out.println("Het product is reeds toegevoegd.");
        } else {
           this.productNummer++;
           nieuwProduct.setProductNummer(this.productNummer);
           bestelling[indexBestelling] = nieuwProduct;
           indexBestelling++;
       }
    }

    public void verwijderProduct(int productNummer) {
        for (int i = 0; i < bestelling.length; i++) {
            if(bestelling[i].getProductNummer() == productNummer) {
                bestelling[i] = null;
                System.out.printf("Product met productnummer %s werd verwijderd", productNummer);
            } else {
                System.out.println("Dit product zit niet in je bestelling.");
            }

        }
    }

    public void toonLijst() {
            for (int i = 0; i < bestelling.length; i++) {
                if (bestelling[i] != null) {
                    System.out.println(bestelling[i].toString());
                }
            }
        }

    public void toonPerMerk(String gezochteNaam){
        for (int i = 0; i < bestelling.length; i++) {
            if (bestelling[i] != null && bestelling[i].getMerk().equals(gezochteNaam)){
                System.out.println(bestelling[i].toString());
            }
        }
    }

    public void toonParfums(){
        for (Product item : bestelling) {
            if (item instanceof Parfum) {
                System.out.println(item.toString());
            }
        }
        }
    public int getAantalProducten() {
        int count = 0;
        for (int i = 0; i < bestelling.length; i++) {
            if (bestelling[i] != null){
                count++;
            }
        }
        return count;
    }


    @Override
    public double totalePrijs() {
        double prijs = 0;
        for (int i = 0; i < bestelling.length ; i++) {
            if (bestelling[i] != null){
                prijs = prijs + bestelling[i].getPrijs();
            }
        }
        return prijs;
    }
}

