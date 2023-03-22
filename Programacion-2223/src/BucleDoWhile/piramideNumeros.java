package BucleDoWhile;

public class piramideNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=6;
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size-i-1;j++) {
        		System.out.print("  ");
        	}
        	for(int j=0;j<i+1;j++) {
        		System.out.print(j+1);
        	}
        	for(int j=0;j<i+1;j++) {
        		System.out.print(j+1);
        	}
        	System.out.println();
        }
	}

}
