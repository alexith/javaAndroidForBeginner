package myVariable;

public class variablesDefined {

  public static void main(String[] args) {
    
    byte myByteMin = Byte.MIN_VALUE;
    byte myByteMax = Byte.MAX_VALUE;
    
    System.out.println(myByteMin);    
    System.out.println(myByteMax);
    
    /*From above lines 7 - 11, now we know after using wrapper in line 7 and 8 that that max value and min value of byte is 128 and -127 respectively.*/
    
    byte myByte = -120;
	
	short myShortMax = Short.MAX_VALUE;
	short myShortMin = Short.MIN_VALUE;
	
	System.out.println(myShortMax);
	System.out.println(myShortMin);
	
	short myShort = (short) 32797; 
	/*see what i did here in line 23 if without casting the int value will cause as ass the max value from line 17 we got is 32767, so if more value than that will fall in int and the compiler will throw an error, so i cast the byte over int value and the compiler now understood*/
	
	int myIntMax = Integer.MAX_VALUE;
	int myIntMin = Integer.MIN_VALUE;
	
	int myInt = 215;
	
	System.out.println(myIntMax);
	System.out.println(myIntMin);
	
	long myLongMax = Long.MAX_VALUE;
	long myLongMin = Long.MIN_VALUE;
	
	System.out.println(myLongMax);
	System.out.println(myLongMin);
	
	long myLongNumber = 5000 + 10 * ( myByte + myShort + myInt );
	
	System.out.println(myLongNumber);
	
  }
}
