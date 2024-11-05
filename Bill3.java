// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = "Dan";
		String name2= "lisa";
        String name3= "Ron";
        int sum= 100;
        double pay= Math.ceil(sum/(double)3);
        String conclude= "Dear "+name1+", "+name2+" and "+name3+": pay "+pay+" Shekels each.";
        System.out.println(conclude);	
	}
}
