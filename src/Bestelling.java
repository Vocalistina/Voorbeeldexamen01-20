import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    private Product[] bestelling = new Product[99];
    private int productNummer = 1000;
    private int indexBestelling = 0;

    //CONSTRUCTORS

    public Bestelling() {

    }

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


    }

