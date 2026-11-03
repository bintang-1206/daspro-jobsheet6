import java.util.Scanner;
public class logicalOperatorWifi05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent, isLecturer, isAccountBlocked;


        System.out.print("Is the user a student? (true/false): ");
        isStudent = sc.nextBoolean();
        System.out.print("Is the user a lecturer? (true/false): ");
        isLecturer = sc.nextBoolean();
        System.out.print("Is the account currently bloked? (true/false): ");
        isAccountBlocked = sc.nextBoolean();

        if((isStudent || isLecturer) && ! isAccountBlocked){
            System.out.println("WIFI access granted");
        } else {
            System.out.println("WIFI access denied");
        }

        
    }
}
