import java.util.Random;

public class StringFuncts {
    // 1. This method will return an email address in the form
    // first.last@ww-p.org
    // Example: getEmail("Kelly", "Vostal") ====> kelly.vostal@ww-p.org
    public static String getEmail(String first, String last) {
        String email = first.toLowerCase() + "." + last.toLowerCase() + "@ww-p.org";
        return email;
    }

    // 2. This method will return initials with periods.
    // Example: getInitials("Kelly", "Vostal") ====> K.V.
    public static String getInitials(String first, String last) {
        String initials = first.substring(0, 1).toUpperCase() + "." + last.substring(0, 1).toUpperCase() + ".";
        return initials;
    }

    // 3. This method will parse the year from a birthdate
    // in the form MMDDYYYY
    // Example: getYear("06021966") ====> 1966
    public static String getYear(String bday) {
        return bday.substring(4);
    }

    // 4. This method will return a lowercase
    // username in the form of the first 3 letters of the first name and
    // last 3 letters of the last name.
    // Example: getUserName("Kelly", "Vostal") ====> keltal
    public static String getUserName(String first, String last) {
        String username = first.substring(0, 3).toLowerCase() + last.substring(last.length() - 3).toLowerCase();
        return username;
    }

    // 5. This method will parse the first name from a full name separated with
    // a space
    // Example: getFirst("Kelly Vostal") ====> Kelly
    public static String getFirst(String fullName) {
        String[] names = fullName.split(" ");
        return names[0];
    }

    // 6. This method will parse the last name from a full name separated with a
    // space
    // Example: getLast("Kelly Vostal") ====> Vostal
    public static String getLast(String fullName) {
        String[] names = fullName.split(" ");
        return names[1];
    }

    // 7. This will return a random 4-letter string of letters
    // Example: getRandomWord() ====> CDRT
    public static String getRandomWord() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        String word = "";
        for (int i = 0; i < 4; i++) {
            char letter = letters.charAt(random.nextInt(letters.length()));
            word += letter;
        }
        return word;
    }

    // 8. This will return a new word of every other letter
    // Example: everyOtherLetter("KNIGHTS") ====> KIHS
    public static String everyOtherLetter(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i += 2) {
            result += word.charAt(i);
        }
        return result;
    }

    // 9. This will return a new word that is the reverse.
    // Example: reverse("KNIGHTS") ====> STHGINK
    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    // 10. This will return true if the sum of the first digit and the last
    // digit is divisible by 5.
    // Example: checkDigit("123456789") ====> TRUE
    // Example: checkDigit("12345543211") ====> FALSE
    // Example: checkDigit("87878787") ====> TRUE
    public static Boolean checkDigit(String creditCard) {
        int firstDigit = Integer.parseInt(String.valueOf(creditCard.charAt(0)));
        int lastDigit = Integer.parseInt(String.valueOf(creditCard.charAt(creditCard.length() - 1)));
        return (firstDigit + lastDigit) % 5 == 0;
    }

    // 11. This will return a string where every other letter is capitalized
    // Example: everyOtherLetterCaps("KellyVostal") ====> KeLlYvOsTaL
    public static String everyOtherLetterCaps(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                result += Character.toUpperCase(word.charAt(i));
            } else {
                result += word.charAt(i);
            }
        }
        return result;
    }

    // 12. This will return a string where every 'o' is replaced with an '8'
    // Example: replaceOsWith8s("KellyVostal") ====> KellyV8stal
    public static String replaceOsWith8s(String word){
        word = word.replace('o', '8');
        word = word.replace('O', '8');
        return word;
    }

    public static void main(String[] args) {
        System.out.println("1. Email: " + getEmail("Kelly", "Vostal"));
        System.out.println("2. Initials: " + getInitials("Kelly", "Vostal"));
        System.out.println("3. Year: " + getYear("06021966"));
        System.out.println("4. UserName: " + getUserName("Kelly", "Vostal"));
        System.out.println("5. FirstName: " + getFirst("Kelly Vostal"));
        System.out.println("6. LastName: " + getLast("Kelly Vostal"));
        System.out.println("7. RandomWord: " + getRandomWord());
        System.out.println("8. EveryOtherLetter: " + everyOtherLetter("encyclopedias"));
        System.out.println("9A. Reverse: " + reverse("racecar"));
        System.out.println("9B. Reverse: " + reverse("JAVA"));
        System.out.println("10A. CheckDigit: " + checkDigit("123456"));
        System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
        System.out.println("11. EveryOtherCaps: "+ everyOtherLetterCaps("KellyVostal"));
        System.out.println("12. Replaces O's with 8's: " + replaceOsWith8s("KellyVostal"));
    }
}