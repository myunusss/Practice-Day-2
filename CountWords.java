public class CountWords{

	public static void main(String[] args){
		String sentence = "Abah anom mencari anaknya di Bandung ";
		String[] word = sentence.split(" "); // memasukan kata pada array yang dipisah oleh spasi " "
		int jumlah = word.length;

		System.out.println("" + sentence);
		System.out.println("Number of words in the string: " + jumlah);
	}
}
