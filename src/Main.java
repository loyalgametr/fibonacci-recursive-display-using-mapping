import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int i = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> hash = new HashMap<>();
        System.out.println("Please enter the num of fibo: ");
        int num = scan.nextInt();
        System.out.println(fibo(num, hash));

        System.out.println(hash);
    }


    static int fibo(int a, Map<Integer, Integer> mem) {


        if (a==0){
            return 0;
        } else if (a==1) {
            return 1;
        } else{
            i++;
            mem.put(i,fibo(a-1, mem)+fibo(a-2, mem));
            return fibo(a-1, mem)+fibo(a-2, mem);
        }


    }
}