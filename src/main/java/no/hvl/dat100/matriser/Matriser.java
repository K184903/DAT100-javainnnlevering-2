package no.hvl.dat100.matriser;

public class Matriser {
    public static void main(String[] args) {
        int[][] matrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        } ;
        
        int[][] nym= {
        		{1, 2, 3},
                {4, 5, 6},
                {7, 5, 9}
        };
        System.out.println(tilStreng(matrise));
        System.out.print(erLik(matrise, nym));
    }
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i: matrise) {
			System.out.print("[");
			for(int j:i) {
				System.out.print(j+" ");
			}System.out.print("]");
			
		}
	}

	//b)
    public static String tilStreng(int[][] matrise) {
        String result = "";
        
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                result += matrise[i][j];
                if (j < matrise[i].length - 1) {
                    result += " ";
                }
            }
            result += " \n";
        }
        
        return result;
    }
    
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int rader = matrise.length;
		int kolonner = matrise[0].length;
		
		int[][] nyMatrise = new int[rader][kolonner];
		
		for(int i = 0; i < rader; i++) {
			for(int j = 0; j < kolonner; j++) {
				nyMatrise[i][j] = matrise[i][j]* tall;
				
			}
		}
	return nyMatrise;
	
	}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length!=b.length) {
			return false;
		}
        for (int i = 0; i < a.length; i++) {
        	for (int j=0;j<a[i].length; j++) {
        		if (a[i][j]!=b[i][j]) {
        			return false; 
        		}
        		
        	}
        }return true;
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
