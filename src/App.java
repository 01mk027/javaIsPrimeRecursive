import java.util.Scanner;

public class App {
    static void incDec(int number, int temp, int dec)
    {
        if(number < -5 || number > temp)
            return;
        System.out.println(number+" "+temp);
        if(number >= -5 && number <= 0) dec *= -1;
        incDec(number-dec, temp, dec);
        }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        incDec(number, number, 5);
    }
}
