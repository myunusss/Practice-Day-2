public class FutureInvest{
	public static void main(String[] args){
		double invest = 1000.0;
		double rate = 10.0;
		int year = 5;

		double futureValue = 0.0;

		System.out.println("Year     Future Value");
		for (int x = 1; x <= year; x++){
			futureValue = invest*Math.pow((1+(rate/100)/12),(x*12));
			System.out.println(x + "    " + futureValue);

		}
	}
}