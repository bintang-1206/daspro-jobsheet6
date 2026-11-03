import java.util.Scanner;
public class nestedThesisExam05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = null;

        System.out.print("Has the student been cleared of compensation? (Y/T or Yes/No) : ");
        String compensationCleared = sc.nextLine(). trim();
        System.out.print("Enter the number of guidance logs with Supervisor 1: ");
        int supervisorP1 = sc.nextInt();
        System.out.print("Enter the number of guidance logs with Supervisor 2: ");
        int supervisorP2 = sc.nextInt();

        if (compensationCleared.equalsIgnoreCase( "Yes")) {
            if (supervisorP1 >= 8 && supervisorP2 >= 4) {
                message = "All requirement are met. The student may register for thesis exam.";
            } else if (supervisorP1 < 8 && supervisorP2 < 4){
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 are fewer than 4 ";
            } else if (supervisorP1 < 8 && supervisorP2 >= 4){
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 ";
            } else if (supervisorP1 >= 8 && supervisorP2 < 4){
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4  ";
            }

        } else {
            message = "Failed: The student has not been cleared of compensation.";

        }
        System.out.println(message);
       
        sc.close();



    }
}