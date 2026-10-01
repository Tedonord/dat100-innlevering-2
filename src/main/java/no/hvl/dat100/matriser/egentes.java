package no.hvl.dat100.matriser;
import java.util.Arrays;

public class egentes {
    public static void main(String[] args) {
        int[][] tabell = {{1,2,3},{4,5,6},{7,8,9}};
        Matriser.skrivUt(tabell);

        int[][] speilet = Matriser.speile(tabell);
        Matriser.skrivUt(speilet);
    }
}
