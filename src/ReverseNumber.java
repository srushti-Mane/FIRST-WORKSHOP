import java.util.Scanner;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num= input.nextInt();
        int reverse=0,rem;
        while(num!=0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder; // 0*10+6=7
            num=num / 10;
        }
        System.out.println("reverse number is : " +reverse);
    }
}
