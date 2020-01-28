import java.sql.Array;
import java.util.Scanner;

public class Bestelling {
    Array[] bestelling = new Array[100];
    int productNummer = 1000;

    //CONSTRUCTORS

    public Bestelling() {

    }

    //METHODES
    public Product voegProductToe(Product nieuwProduct) {
        Product toevoegingLijst = null;
        Scanner toevoegingProduct = new Scanner(System.in);
        System.out.println("NIEUW PRODUCT TOEVOEGEN" );
        System.out.println("Merk: ");
        String merk = toevoegingProduct.nextLine();
        toevoegingProduct.nextLine();
        productNummer = productNummer +1;
        System.out.println("Naam: ");
        String naam = toevoegingProduct.nextLine();
        toevoegingProduct.nextLine();
        System.out.println("Volume: ");
        int volume = toevoegingProduct.nextInt();
        System.out.println("Prijs iBTW: ");
        double prijs = toevoegingProduct.nextDouble();
        System.out.println("Welk soort product wil je toevoegen? 1= Aftershave, 2= Deodorant, 3=Parfum");
        String gekozenProduct = toevoegingProduct.nextLine();
        toevoegingProduct.nextLine();
        if (gekozenProduct.equals("1")) {
            System.out.println("Welke soort Deotype is dit, VAPO of STICK? ");
            DeoType soort = DeoType.valueOf(toevoegingProduct.nextLine());
            toevoegingProduct.nextLine();
            toevoegingLijst = new AfterShave(productNummer,merk,naam,volume,prijs,soort);
        } else if (gekozenProduct.equals("2")){
            System.out.println("Welke soort Deotype is dit, VAPO of STICK? ");
            DeoType soort = DeoType.valueOf(toevoegingProduct.nextLine());
            toevoegingProduct.nextLine();
            toevoegingLijst = new Deodorant(productNummer,merk,naam,volume,prijs,soort);
        } else if (gekozenProduct.equals("3")) {
            toevoegingLijst = new Parfum(productNummer,merk,naam,volume,prijs);
        } else {
            System.out.println("Dit product bestaat niet.");
        }
        if (equals(toevoegingLijst)) {
            System.out.println("Het product is reeds toegevoegd.");
        }
        return  toevoegingLijst;

    }/*
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
        for (int i = 0; i < bestelling.length ; i++) {
            super.toString();
        }
    }
    public void toonPerMerk(){
        super.toString();
    }

    /*
    public void toonParfums(){
        for (int i = 0; i < bestelling.length ; i++) {
            while (bestelling.getClass() == Parfum) {

            }
        }


        }*/
    }

