import java.util.Scanner;
public class PemilihanHariDenganIf21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String dayType;
        int number; 

        System.out.println("Input number: ");
        number = sc.nextInt();

        if (number >= 1 && number <=5){
            dayType = "weekday";
        } else if (number == 6 || number == 7){
            dayType = "weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println("Number " + number + " is " + dayType);
    } 
}
