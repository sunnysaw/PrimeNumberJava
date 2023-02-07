import java.util.Scanner;
/*
Question : Write a program to check print the prime number of given range.
 */
public class Main {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LOWER LIMIT :");
        int a = sc.nextInt();
        System.out.println("ENTER THE UPPER LIMIT :");
        int b = sc.nextInt();
        System.out.println("Printing the result : ");
        for (int i = a; i <= b; i++){
           for (int j = 2; j < i; j++){
               if (i % j == 0) {
                   flag = 0;
                   break;
               }else
                   flag = 1;
           }
            if (flag == 1){
                System.out.println(i + " ");
            }
        }
    }
}