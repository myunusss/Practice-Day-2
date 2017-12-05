import java.util.Scanner;

public class PrintChar {

	public static void main(String[] args){
		Scanner inputA = new Scanner(System.in);

		System.out.print("Start : ");
		char start = inputA.next().charAt(0);

		System.out.print("Finish : ");
		char finish = inputA.next().charAt(0);

		int a = (int) start;
		int b = (int) finish;


		System.out.println("Desimal for " + start + " is : " + a);
		System.out.println("Desimal for " + finish + " is : " + b + "\n");

		for (int i = 1; a <= b; i++){
			start = (char) a;
			System.out.print(start + " ");

			if (i %20 == 0){
				System.out.println();
			}
			a++;
		}
	}
}