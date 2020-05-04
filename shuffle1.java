/*The challenge here was we have been given the output and 
 * we need to arrange block of code to get exact match*/


public class shuffle1 {
	public static void main(String[] args) {
		int x = 3;
		while(x>0) {
			if (x>2) {
				System.out.print("a");
			}
			x = x-1;
			System.out.print("-");
		if(x==2) {
			System.out.print("b c");
			}
		if(x==1) {
			System.out.print("d");
			x = x - 1;
		}
	  }
	}
}
