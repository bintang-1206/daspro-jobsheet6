import java.util.Scanner;
public class nestedLabAccess05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActiveStudent, isSanctioned, hasLecturerPermission, isLabAssistant;

        System.out.print("Are you an active student? (true/false): ");
        isActiveStudent = sc.nextBoolean();
        System.out.print("Are you currently being sanctioned? ? (true/false): ");
        isSanctioned = sc.nextBoolean();
        System.out.print("Do you have permission from the lecturer? (true/false): ");
        hasLecturerPermission = sc.nextBoolean();
        System.out.print("Are you a lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned){
            if(hasLecturerPermission || isLabAssistant){
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        }else {
            System.out.println("Access denied: student status does not meet the requirements");
        }
        sc.close();
    }
} 
