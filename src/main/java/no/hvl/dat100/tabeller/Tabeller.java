package no.hvl.dat100.tabeller;

public class Tabeller {
	
	public static void main( String[] args) {
		int[]tabell = {1,2,3,4};
		
		int[]reversert = reverser(tabell);
		
		skrivUt(reversert);
	
	

		
		}

	// a)
	public static void skrivUt(int[] tabell) {
		
        
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
   
	}

	// b)
	public static String tilStreng(int[] tabell) {

		 String streng ="[";
			for(int i = 0; i < tabell.length; i++) {
				
				streng+= tabell[i];
				if(i<tabell.length-1) {
					streng+=",";
							
				}
				
			} streng+="]";
			
			return streng;
			
		}
 

	// c)
	public static int summer(int[] tabell) {

		int a = 0;
		for(int i = 0; i < tabell.length; i++) {
			a+= tabell[i];
			
			
		}
		return a;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i=0;
		while(i<tabell.length) {
			if(tall==tabell[i] ){
				return true;
			}i++;
		}return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i=0;
		while(i<tabell.length) {
			if(tall==tabell[i] ){
				return i;
			}i++; 
		}return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[]reversertTabell = new int[tabell.length];
		
				
		for(int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length-1-i];
		
		}
		return reversertTabell;
		

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int j = 0;
		boolean sortert = true;
		
		while(sortert && j< tabell.length-1) {
			if(tabell[j]>tabell[j+1]) {
				sortert = false;
				
			}
			j++;
			
		}
		return sortert;
	}

	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		
		int[]tab3 = new int[tabell1.length + tabell2.length];
		for(int i = 0; i< tabell1.length;i++) {
			tab3[i] = tabell1[i];
		}
		for(int j =0; j< tabell2.length; j++) {
			tab3[tabell1.length + j] = tabell2[j];
			
		}
		return tab3;
	}
	}

	
	

