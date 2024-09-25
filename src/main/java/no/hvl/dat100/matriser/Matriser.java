package no.hvl.dat100.matriser;

public class Matriser {
    public static void main(String[] args) {
        int[][] matrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        } ;
        
        System.out.println(tilStreng(matrise));
  
 {
		int[][] tal = {{1,2,3,4}, {1,3,5,6}, {2,4,5,6}};
		int[][] tal2= {{1,2,3,4}, {1,3,5,6}, {2,4,5,6}};
		skrivUt(tal);

 }
		
	}
	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	//b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder ();
		
		for ( int [] element : matrise) {
			for (int i : element ) {
				sb.append(i).append(" "); 
			}
			sb.setLength(sb.length() - 1);
			sb.append("\n"); 
		}
		return sb.toString(); 
	}
	
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
	 return true;
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
