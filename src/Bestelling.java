import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    Product[] bestelling = new Product[100];
    int productNummer = 1000;

    //CONSTRUCTORS

    public Bestelling() {

    }

    //METHODES
    public void voegProductToe(Product nieuwProduct) {

    }
    /*
    public void verwijderProduct(int productNummer) {
        Scanner productverwijderen = new Scanner(System.in);
        System.out.println("PRODUCT VERWIJDEREN\n" +
                "Verwijder productnummer: ");
        int teVerwijderenProductnummer = productverwijderen.nextInt();
        for (int nummer :
             ) {

        }
      */
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


    }

