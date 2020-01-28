import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    Array[] bestelling = new Array[100];
    int productNummer = 1000;

    //CONSTRUCTORS

    public Bestelling(Array[] bestelling, int productNummer) {
        this.bestelling = bestelling;
        this.productNummer = productNummer;
    }

    //METHODES
    public Product[] voegProductToe(Product[] newArtikel) {
        Scanner toevoegingProduct = new Scanner(System.in);
        Product[] newartikel = new Product[];
        System.out.println("NIEUW PRODUCT TOEVOEGEN\n " +
                "Merk: ");
        return  newArtikel;

    }
    public void verwijderProduct(int productNummer) {
        Scanner productverwijderen = new Scanner(System.in);
        System.out.println("PRODUCT VERWIJDEREN\n" +
                "Verwijder productnummer: ");
        int teVerwijderenProductnummer = productverwijderen.nextInt();
        for (:
             ) {
            
        }
    }
}
