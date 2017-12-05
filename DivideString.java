public class DivideString{
	public static void main(String args[]){
		String number = "120831";
	
		String _1 = number.substring(0,2);
		String _2 = number.substring(2,4);
		String _3 = number.substring(4,6);

		System.out.print("" + _1);
		System.out.print(" " + _2);
		System.out.print(" " + _3);
	}
}