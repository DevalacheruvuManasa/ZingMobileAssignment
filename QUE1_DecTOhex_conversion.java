/*Here is the above code for conversion of givan valid deciaml to hexadecimal and given hexadecimal to decimal */
import java.util.Scanner;//importing util package for use scanner object

public class dec_hex {//naming of class

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);
        
        
        // Part a: Decimal to Hexadecimal conversion
        System.out.println("Enter a decimal number:");
        String decimalInput = scanner.nextLine();
        
        if (isValidDecimal(decimalInput)) {//calling validation function and returning value
            int decimal = Integer.parseInt(decimalInput);
            String hexadecimal = decimalToHexadecimal(decimal);
            System.out.println("Hexadecimal representation: " + hexadecimal);
        } else {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
        
        // Part b: Hexadecimal to Decimal conversion
        System.out.println("Enter a hexadecimal number:");
        String hexadecimalInput = scanner.nextLine();
        
        if (isValidHexadecimal(hexadecimalInput)) {
            int decimal = hexadecimalToDecimal(hexadecimalInput);
            System.out.println("Decimal representation: " + decimal);
        } else {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
        }
        
        scanner.close();
    }
    
    // Part a: function Decimal to Hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        
        while (decimal != 0) {
            int remainder = decimal % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder + 'A' - 10);
            hexadecimal.insert(0, hexDigit);
            decimal /= 16;
        }
        
        return hexadecimal.toString();
    }
    
    // Part b:  function Hexadecimal to Decimal
    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        
        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexDigit = hexadecimal.charAt(i);
            int digitValue = Character.isDigit(hexDigit) ? hexDigit - '0' : hexDigit - 'A' + 10;
            decimal = decimal * 16 + digitValue;
        }
        
        return decimal;//returing decimal value
    }
    
    // Validation function whether given input is decimal or not
    public static boolean isValidDecimal(String input) {
        return input.matches("[0-9]+");//checks whether input string between 0-9
    }
    //validation function for whether given input is hexa decimal or not
    public static boolean isValidHexadecimal(String input) {
        return input.matches("[0-9A-Fa-f]+");//checks whether input string between 0-9 and A-F
    }
}
