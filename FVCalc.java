// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		int rate = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);
		int countYears = 0;
		double newValue = currentValue;
		while (countYears < years)
		{
			newValue = newValue + (newValue * rate / 100);
			countYears++;
		}
		System.out.println("After "+years+" years, a $"+(int)currentValue+" saved at "+rate+".0% will yield $"+(int)newValue); 

	}
}