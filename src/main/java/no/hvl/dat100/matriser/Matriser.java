package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		String tab = "";
		for (int[] innitabeller : matrise){
			tab = "[";
			int leng = innitabeller.length;
			if (leng == 0){
				tab += "]";
			}
			else{
				for (int verdi : innitabeller){
					tab += verdi+", ";
				}
				tab = tab.substring(0,(tab.length())-2);
				tab +="]";
			}	
			System.out.println(tab);
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tab = "";
		for (int[] innitabeller : matrise){
			int leng = innitabeller.length;
			if (leng == 0){
				tab += "Ø \n";
			}
			else{
				for (int verdi : innitabeller){
					tab += verdi+" ";
				}
				tab = tab.substring(0,tab.length()-1);
				tab +="\n";
			}	
		}
		return tab;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length;i++){
			nymatrise[i] = new int[matrise[i].length];
			if (nymatrise[i].length==0){
			}
			else{
				for (int j = 0; j < matrise[i].length;j++){
					nymatrise[i][j] = tall*matrise[i][j];
				}
			}
		}
		return nymatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean svar = true;
		if (a.length == b.length){
			for (int i = 0; i < a.length;i++){
				if (a[i].length == b[i].length){
					for (int j = 0;j < a[i].length;j++){
						if (a[i][j] != b[i][j]){
							svar = false;
							return svar;
						}
					}
				}
				else{
					svar = false;
					return svar;
				}
			}
		}
		else{
			svar = false;
			return svar;
		}
		return svar;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] ny = new int[matrise.length][];
		for (int i = 0; i < matrise.length;i++){
			ny[i] = matrise[i].clone();
		}

		for (int i = 0; i < matrise.length;i++){
			for (int j = 0; j < matrise[i].length;j++){
				ny[i][j] = matrise[j][i];
			}
		}
		return ny;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
