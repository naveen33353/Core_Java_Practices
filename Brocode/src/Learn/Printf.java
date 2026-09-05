package Learn;

public class Printf {
public static void main(String[] args) {
	
	
//	[flags] [width][precision]                                             precision : after % sign specify how may digits 
//	System.out.printf("The price is %f", variable name);                   you need after the decimal.
//	double  %f (all floating numbers type)
//	int  %d
//	char  %c
//	String  %s
//	boolean  %b

//  flags    after  % sign                                                            width
//	+ = output a plus                                    							  0 = zero paddng
//	, = comma grouping separator													  number = right justified padding
//	( = negative number enclosed in ()										          negative number  = left justified padding
//	Space = display a minus if negative , space if postive
	
	
	double price1=9.99;
	double price2 = 1000.15;
	double price3 = -54.91;
	
	System.out.printf("The price is %f\n", price1);
	
//	precision
	System.out.printf("The price is %.2f\n", price1);
	
//	plus sign
	System.out.printf("The price is %+f\n", price1);
	
//	grouping 
	System.out.printf("The price is %,f\n", price2);
	
//	( negative numbers
	System.out.printf("The price is %(f\n", price1);
	System.out.printf("The price is %(f\n", price3);
	
//	space
	System.out.printf("The price is % f\n", price1);
	System.out.printf("The price is % f\n", price3);
	
	
	System.out.println();
	
//	zero padding
	int id1=1;
	int id2=23;
	int id3=456;
	int id4=7890;
	
	System.out.printf("%4d\n",id1);
	System.out.printf("%4d\n",id2);
	System.out.printf("%4d\n",id3);
	System.out.printf("%4d\n",id4);
	
	System.out.println();
	
	System.out.printf("%04d\n",id1);
	System.out.printf("%04d\n",id2);
	System.out.printf("%04d\n",id3);
	System.out.printf("%d\n",id4);
	
}

}
