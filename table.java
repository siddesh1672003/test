import java.util.*;
public class table {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Table of ");
        System.out.print(+a);
        System.out.println(" : ");
        for(i = 1; i <= 10; i++)
        {
            System.out.println(+a*i);
        }
    }
    
}