/*Taking mobile number as a input from user and replacing with "#" value except with 3 last digits */
import java.util.Scanner;//import java.util package
public class mobile{//naming of class
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the mobile number");
        String mobile_number=inp.nextLine();//Taaking input from user
        change(mobile_number);//passing to method
    }
    /* function for replacing*/
    public static void change(String number) {
        StringBuilder str1 = new StringBuilder();
        int length = number.length();//finding length of the input
        for (int i = 0; i < length - 3; i++) {
            str1.append("#");//replacing numericals to "#" string
        }
        str1.append(number.substring(length - 3));
        System.out.println(str1.toString());
    }
}
