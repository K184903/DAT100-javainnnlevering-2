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
<<<<<<< Updated upstream
		int kolonne = matrise[0].length;
		
		int[][]nyMatrise = new int[rader][kolonne];
		
		for(int i = 0; i < rader; i++) {
			for(int j = 0; j < kolonne; j++) {
				
				nyMatrise[i][j]=matrise[i][j]*tall;
						
			}
		}
	return nyMatrise;
=======
		int kolonner = matrise[0].length;
		
		int[][]nyMatrise = new int[rader][kolonner];
		
		for(int i = 0; i<rader; i++) {
		
		for(int j = 0; j<kolonner;j++) {
			
			nyMatrise[i][j]= matrise[i][j]*tall;
				}
		}
		return nyMatrise;
>>>>>>> Stashed changes
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		
		for(int[]i: a) {
			for(int[]j: b) {
				
				
		}
		}

		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int n = matrise.length;
	    int[][] nyMatrise = new int[n][n];
		
		for (int i=0; i < n; i++) {
			for (int j=0; j < n; j++) {
				nyMatrise[i][j] = matrise[i][j];
		       
		      }
		}
		
	    for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
			    int temp = nyMatrise[i][j];
			      nyMatrise[i][j] = nyMatrise[j][i];
			      nyMatrise[j][i] = temp;
			        }
			    }
	    return nyMatrise;
	}
	
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
