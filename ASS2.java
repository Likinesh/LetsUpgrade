import java.util.*;
public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int rev=0,rem=0;
        while(M!=0){
            rem=(rem*10)+(M%10);
            M=M/10;
        }
        if(M==rem){
            System.out.println("It is a palindrome");
        }
        if(M!=rem){
            System.out.println("It is not a palindrome");
        }
    }
}
