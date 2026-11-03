import java.util.Scanner;
public class task1Largest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2 ;
        int num3 ;

        System.out.print("Number 1 is = ");
        num1 = sc.nextInt();
        System.out.print("Number 2 is = ");
        num2 = sc.nextInt();
        System.out.print("Number 3 is = ");
        num3 = sc.nextInt();
        

        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("The max number is number 1 = " + num1);
            } else {
                System.out.println("The max number is number 3 = " + num3);
            }
        } else {
            if (num2 > num3){
                System.out.println("The max number is = " + num2);
            } else {
                System.out.println("The max number is number 3 = " + num3);
            }
        }
        sc.close();

    }
}
