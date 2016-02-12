package edu.saintjoe.cs.rpostma;

public class BeerSong {

	public static void main(String[] args) {
		// Book code for the song
		int beerNum = 99;
		
		String word = "bottles";
		
		while (beerNum > 0) {
			
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			beerNum = beerNum - 1;
			
			if (beerNum == 1) {
				word = "bottle";
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				System.out.println("");
			}else {
				System.out.println("No more bottle of beer on the wall.");
			}
			
		}//end while
		
	}//end main
	
}//end BeerSong class
