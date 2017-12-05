public class CountVowels{

	public static void main(String[] args){
		String word = "Abah Anom";
		String words = word.toLowerCase();
		String[] vowels = {"a","i","u","e","o"};
		
		int y = vowels.length;
		int a = 0, b = 1, nilai = 0;

		for (int i = 0; i < words.length(); i++){
			String character = words.substring(a,a+1);
			for (int j = 0; j < y; j++){
				if (character.matches(vowels[j])){
					nilai++;
				}
			}
			a++;
		}
		System.out.println("Number of Vowels in the string " + words + " is : " + nilai);
	}
}