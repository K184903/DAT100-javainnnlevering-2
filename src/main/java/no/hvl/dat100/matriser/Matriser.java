package no.hvl.dat100.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] tal = {{1,2,3,4}, {1,3,5,6}, {2,4,5,6}};
		int[][] tal2= {{1,2,3,4}, {1,3,5,6}, {2,4,5,6}};
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
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		String str_a=" ";
		for(int[]element: a) {
			for(int i: element) {
				str_a+=i;							
			}
		}
		String str_b=" ";
		for(int[] element2: b) {
			for(int j: element2) {
				str_b+=j;							
		}}if(str_a==str_b) {
			return true;
		}else{
			return false; 
		}
			
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
