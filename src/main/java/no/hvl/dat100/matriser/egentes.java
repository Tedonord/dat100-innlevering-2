package no.hvl.dat100.matriser;

public class egentes {
    public static void main(String[] args) {
        int[][] tabell = {{2,1,3}};
        int[][] tabell2 = {{3,1},{4,2},{5,3}};
        int[][] mlti = Matriser.multipliser(tabell, tabell2);
        Matriser.skrivUt(mlti);
    }
}
