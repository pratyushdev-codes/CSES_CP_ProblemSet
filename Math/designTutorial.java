import java.util.*;
public class designTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            


            long n  = sc.nextInt();           

            if(n % 2 == 0) {
   
                System.out.println(4 + " " + (n - 4));
             } else{
                System.out.println(9 + " " + (n - 9));
            }
            
    }
}
