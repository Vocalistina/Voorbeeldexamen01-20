public interface Berekenbaar {
    final static int BTW = 21;
    private double totalePrijs() {
        return prijsTotaalInclBTW;
    }
    private double totalePrijsExclBTW() {
        double prijsTotaalExclBTW = totalePrijs() / (1+(BTW/100));
        return prijsTotaalExclBTW;
    }
}
