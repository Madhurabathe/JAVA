import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        // Generate the password
        String password = generatePassword(length);

        System.out.println("Generated Password: " + password);
    }

   
    private static String generatePassword(int length) {
        // charachter for password
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?/";

        // Combine 
        String allChars = upperCase + lowerCase + numbers + specialChars;

        //  Random pick 
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length()); 
            password.append(allChars.charAt(index));       
        }

        return password.toString();
    }
}
