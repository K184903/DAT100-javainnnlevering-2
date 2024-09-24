package no.hvl.dat100.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] tal = {{1,2,3,4}, {1,3,5,6}, {2,4,5,6}};
		skrivUt(tal);
		
	}
	// a)
	public static void skrivUt(int[][] matrise) {

		for(int[] i: matrise) {
			System.out.print("[");
			for(int j: i) {
			System.out.print(j+"\t");
			
		}System.out.println("]");
		}
	}
		

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int rader = matrise.length;
		int kolonne = matrise[0].length;
		
		int[][]nyMatrise = new int[rader][kolonne];
		
		for(int i = 0; i < rader; i++) {
			for(int j = 0; j < kolonne; j++) {
				
				nyMatrise[i][j]=matrise[i][j]*tall;
						
			}
		}
	return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for(int[]i: a) {
			for(int[]j: b) {
				
				
		}
		}

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
