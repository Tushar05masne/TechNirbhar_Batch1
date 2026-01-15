package Tejaswini_Program_List2;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Sharayu/Tejaswini Sangita Sanjay Masne";

        String[] words = str.split(" ");  // Split string into words
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        System.out.println("Reversed Words String: " + result.trim());
	}

}
