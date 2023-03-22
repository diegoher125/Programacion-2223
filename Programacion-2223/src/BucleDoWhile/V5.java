package BucleDoWhile;

public class V5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size = 5;
	     for(int i=0;i<size;i++) {
	        for(int j=1;j<i+1;j++) {
	        	System.out.print("  ");
	        }
	        System.out.print("* * * ");
	        for(int j=0;j<size-i-1;j++) {
	        	System.out.print("  ");
	        }
	        for(int j=0;j<size-i-1;j++) {
	        	System.out.print("  ");
	        }
	        System.out.print("* * * ");
	        for(int j=1;j<i+1;j++) {
	        	System.out.print("  ");
	        }
	        System.out.println();
	        }
		}
	}


