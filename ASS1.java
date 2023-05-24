import java.util.*;
public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        if(M%3==0 && M%5==0){
            System.out.print("Good Number");
        }
        if(M%3==0 && M%5!=0){
            System.out.print("Bad Number");
        }
        if(M%3!=0 && M%5==0){
            System.out.print("Poor Number");
        }
        if(M%3!=0 && M%5!=0){
            System.out.print("-1");
        }
    }
}
