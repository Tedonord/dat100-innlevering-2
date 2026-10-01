package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab = "[";
		int leng = tabell.length;
		if (leng == 0){
			tab = "[]";
			return tab;
		}
		else{
			for (int i = 0; i < leng-1;i++){
				tab = tab+tabell[i]+",";
			}
		}
		tab = tab+tabell[leng-1]+"]";
		return tab;
			
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length;i++){
			sum = sum + tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for (int i = 0; i < tabell.length;i++){
			if (tall == tabell[i]) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for (int i = 0; i < tabell.length;i++){
			if (tabell[i] == tall){
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rev = new int[tabell.length];
		int leng = tabell.length;
		for (int i = 0; i < leng;i++){
			rev[leng-1-i] = tabell[i];
		}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i = 0; i < tabell.length-1;i++){
			if (tabell[i+1] < tabell[i]){
				sortert = false;
				return sortert;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int samlengd = tabell1.length + tabell2.length;
		int[] sammen = new int[samlengd];
		for (int i = 0;i < tabell1.length;i++){
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length;i++){
			sammen[tabell1.length+i] = tabell2[i];
		}
		return sammen;

	}
}
