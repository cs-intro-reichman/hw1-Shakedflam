// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args[0]);
		double interest=Double.parseDouble(args [1]);
		double interestRate= interest/100;
        int years=Integer.parseInt(args[2]);
        double futureValue=currentValue*Math.pow((1+interestRate), (years));
        
        String result= "After "+((int)years)+" years, a $"+ currentValue+" saved at "+interest+"%25 will yield $"+((int)futureValue)+".";
        System.out.println(result);
	}
}