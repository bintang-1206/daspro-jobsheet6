import java.util.Scanner;
public class task3AssistantSelection05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status_active, aca_sanction, certificate;
        int programming_grade, interview_score;

        System.out.print("Are you an active student? (true/false) #type true for yes and false for no : ");
        status_active = sc.nextBoolean();
        System.out.print("Are you in a academic sanction? (true/false) #type true for yes and false for no : ");
        aca_sanction = sc.nextBoolean();
        
        if (status_active && !aca_sanction){
            System.out.print("Input your programming grade : ");
            programming_grade = sc.nextInt();
            System.out.print("Do you have any Programming certificate? (true/false) #type true for yes and false for no : ");
            certificate = sc.nextBoolean();
            if (programming_grade > 80 || certificate){
                System.out.print("You passed the administration selection \nInput your interview score : ");
                interview_score = sc.nextInt();
                if (interview_score > 75){
                    System.out.println("You passed interview test: Congratulation you're the new lab assistant");
                } else {
                    System.out.println("Failed: Your interview score is under the requirement");
                }
            } else {
                System.out.println("Failed: Your programming grade is under the requirement or you don't have programming certificate");
            }
        } else if (status_active == true && !aca_sanction == false){
            System.out.println("Failed: You're in a academic sanction");
        } else if (status_active == false && !aca_sanction == true) {
            System.out.println("Failed: You're not active student");
        } else {
            System.out.println("Failed: You're not active student and in academic sanction");
        }
        sc.close();
    }
}
