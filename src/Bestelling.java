import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    Product[] bestelling = new Product[99];
    int productNummer = 1000;

    //CONSTRUCTORS

    public Bestelling() {

    }

    //METHODES
    public void voegProductToe(Product nieuwProduct) {
       if (equals(nieuwProduct)){
           this.productNummer++;
        } else {
           System.out.println("Het product is reeds toegevoegd.");
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
        for (Product parfum : bestelling) {
            if (parfum instanceof Parfum) {
                System.out.println(parfum.toString());
            }
        }
        }
    public int getAantalProducten() {
        int count = 0;
        for (int i = 0; i < bestelling.length; i++) {
            count++;
        }
        return count;
    }


    }

