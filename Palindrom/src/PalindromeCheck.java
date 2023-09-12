import java.util.Scanner;

public class PalindromeCheck {   

   
public static boolean isPalindrome(String text) {
        
        
    String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();   
    int length = cleanedText.length();
        
       
    for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false;
            }
        }
  
    return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin veya sayı girin: ");
        
        
        String input = scanner.nextLine();

        boolean isPalindromic = isPalindrome(input);

        System.out.println("Palindrom durumu: " + isPalindromic);
    }
}

    