import java.util.Random;

public class Word {
	private String original;

	public Word(String s) {
		original = s;
	}

	public String reverse() {
		// Reverses the original string
			String reversed = "";
			for (int i = original.length() - 1; i >= 0; i--) {
				reversed += original.charAt(i);
			}
			return reversed;
		}

		public int getLength() {
			// Returns the length of the original string
			return original.length();
		}

		public boolean isPalindrome() {
			// Determines if the original string is a palindrome
			// by comparing it with its reverse
			String reversed = reverse();
			return original.equalsIgnoreCase(reversed);
		}

		public boolean isPalindrome2() {
			// Determines if the original string is a palindrome
			// by checking pairs of letters
			int length = original.length();
			for (int i = 0; i < length / 2; i++) {
				if (original.charAt(i) != original.charAt(length - i - 1)) {
					return false;
				}
			}
			return true;
		}

		public String removeVowels() {
			// Removes vowels from the original string
			return original.replaceAll("[aeiouAEIOU]", "");
		}

		public String anagram() {
			// Creates a random anagram of the original word
			char[] letters = original.toCharArray();
			Random random = new Random();
			for (int i = 0; i < letters.length; i++) {
				int j = random.nextInt(letters.length);
				char k = letters[i];
				letters[i] = letters[j];
				letters[j] = k;
			}
			return new String(letters);
		}

		public static void main(String[] args) {
			Word word = new Word("level");

			System.out.println("Original: " + word.original);
			System.out.println("Reversed: " + word.reverse());
			System.out.println("Length: " + word.getLength());
			System.out.println("Is Palindrome: " + word.isPalindrome());
			System.out.println("Is Palindrome2: " + word.isPalindrome2());
			System.out.println("Without Vowels: " + word.removeVowels());
			System.out.println("Anagram: " + word.anagram());
		}
	}
