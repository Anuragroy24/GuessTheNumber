import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);
        int number = 0;

        do{
            System.out.println("Enter the Number(0 -100): ");
            number = sc.nextInt();
            if(number == randomNumber){
                System.out.println("Yeah...you guess the right number!!");
                break;
            }
            else if(number > randomNumber){
                System.out.println("Number is too large");
                System.out.println("Try again!");
            }
            else{
                System.out.println("oops..Number is too small");
                System.out.println("You are closer ..Try again");
            }
        }while(number >= 0);

        System.out.print("you Guess the right Number :");
        System.out.println(number);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}