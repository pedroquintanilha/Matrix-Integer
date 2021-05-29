
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the number of rows and then the number of columns ");
	
		int[][] mat= new int[s.nextInt()][s.nextInt()];
		
		System.out.println("Enter the elements of the matrix: ");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]=s.nextInt();
			}
		}
		
		int occ=0;
		int value;
		
		do {
			System.out.print("Enter an integer that is in the matrix: ");
			value=s.nextInt();
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					if(mat[i][j]==value) {
					occ++;
					}
				}
			}
		    
		} while (occ==0);
		
		for(int i=0; i<mat.length; i++) {
		    	for(int j=0; j<mat[i].length; j++) {
					if(mat[i][j]==value) {
						System.out.println();
						System.out.println("Position: "+i+", "+j);				   
					
						if(j-1>=0) {
						System.out.println("Left: "+mat[i][j-1]);
					
						}
						if(i-1>=0) {
						System.out.println("Up: "+mat[i-1][j]);
					
						}
						if(j+1<mat[i].length) {
						System.out.println("Right: "+mat[i][j+1]);
						}
						if(i+1<mat.length) {
						System.out.println("Down: "+mat[i+1][j]);
						}
						
					}
		    	}
		}
		
		s.close();
	}
}
					
			
			
						
						
		
		

