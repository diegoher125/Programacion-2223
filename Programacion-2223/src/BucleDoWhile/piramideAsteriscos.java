package BucleDoWhile;

public class piramideAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size-i-1;j++) {
        		System.out.print("  ");
        	}
        	for(int j=0;j<i*2+1;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
