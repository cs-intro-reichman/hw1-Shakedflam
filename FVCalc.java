// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double interest=Double.parseDouble(args [0]);
		double interestRate= interest/100;
        int currentValue=Integer.parseInt(args[1]);
        double years=Double.parseDouble(args[2]);
        double futureValue=currentValue*Math.pow((1+interestRate), (years));
        
        String result= "After "+((int)years)+" years, a $"+ currentValue+" saved at "+interest+"% interese rate, will yield "+(((int)futureValue)-currentValue)+".";
        System.out.println(result);
	}
}