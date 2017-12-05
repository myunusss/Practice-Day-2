import java.util.Scanner;

public class MiddleChar{

	public static void count(){

	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int number;

		System.out.print("Masukan number : ");
		number = input.nextInt();

		String num = Integer.toString(number);

		int a = num.length() / 2;
		int b = 0;

		if (number %2 == 0){
			System.out.println("Is EVEN !");
			System.out.println(num.substring(a,a+1));
		} else{
			System.out.println(num.substring(a-1,a+1));
			System.out.println("Is ODD !");
		}
	}
}