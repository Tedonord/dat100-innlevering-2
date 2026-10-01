package no.hvl.dat100.tabeller;

public class egentest {
    public static void main(String[] args) {
        int[] tabell = {1,2,5,6,9};
        int[] rev = Tabeller.reverser(tabell);
        String svar = Tabeller.tilStreng(rev);
        System.out.println(svar);
    }
}
