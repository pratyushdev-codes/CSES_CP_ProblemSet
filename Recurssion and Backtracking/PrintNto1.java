import java.util.*;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(n);
    }

    public static void printNto1(int n) {
        if (n == 0) return; 
        System.out.print(n + " ");
        printNto1(n - 1);    
    }
}
