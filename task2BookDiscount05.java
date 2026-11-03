import java.util.Scanner;
public class task2BookDiscount05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book_category;
        int number_book;

        System.out.print("Input the book category : ");
        book_category = sc.nextLine().trim().toLowerCase();
        System.out.print("How many book you buy : ");
        number_book = sc.nextInt();

        if (book_category.equalsIgnoreCase("dictionary")){
            if (number_book > 2){
                System.out.println("You get discount : 10% + 2%");
            } else {
                System.out.println("You ger discount : 10%");
            }
        } else if (book_category.equalsIgnoreCase("novel")) {
            if (number_book > 3){
                System.out.println("You get discount : 7% + 2%");
            } else {
                System.out.println("You get discount : 7% + 1%");
            }
        } else {
            if (number_book >  3){
                System.out.println("You get discount : 5%");
            } else {
                System.out.println("Buy more books to get discount :)");
            }
        }
        sc.close();

    }
}
