public interface Berekenbaar {
    final static int BTW = 21;

    //METHODES
    double totalePrijs();

    default double totalePrijsExclBTW() {
        double prijsTotaalExclBTW = totalePrijs() / (1+(BTW/100));
        return prijsTotaalExclBTW;
    }
}
