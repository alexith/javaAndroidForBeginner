package myJava;

public class myJava {
	public static void main(String[] args) {
		char[] myList = {'a', 'c', 'b', 'd'};
		int myListLength = myList.length;
		
String shuffler = myList.random() * myListLength;
		System.out.println(shuffler);
	}
}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot invoke random() on the array type char[]

	at myJava.myJava.main(myJava.java:8)
*/
