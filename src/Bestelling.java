import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    Product[] bestelling = new Product[99];
    int productNummer = 1000;
    int indexBestelling = 0;

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
        for (Product i : bestelling) {
            System.out.println(i.toString());
        }
    }
    public void toonPerMerk(){
        super.toString();
    }

    public void toonParfums(){
        for (Product onderdeel : bestelling) {
            if (onderdeel instanceof Parfum) {
                System.out.println(onderdeel.toString());
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

