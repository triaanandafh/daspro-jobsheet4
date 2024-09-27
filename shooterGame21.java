import java.util.Scanner;
public class shooterGame21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double targetDistance;

        System.out.println("Input target distance: ");
        targetDistance = sc.nextDouble();

        if (targetDistance <= 5){
            System.out.println("Use Melee weapons");
        } else {
            System.out.println("Use Ranged weapons");
        }
    }
}
