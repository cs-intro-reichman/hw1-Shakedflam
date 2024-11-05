// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	  int num= Integer.parseInt(args[0]);
	  int units =num%10;
	  int tens= (num/10)%10;
	  int hundreds= (num/100);
	  String print = hundreds+ " hundreds, "+ tens +" tens, and "+units+" ones.";
	  System.out.println(print);
	}
}
