import java.util.Scanner;

public class Average {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       int N =  sc.nextInt();
       String Snum = sc.next();
       char[] cNum = Snum.toCharArray();
       int sum = 0;
       for(int i = 0; i < cNum.length; i++) {
           sum += cNum[i];
       }
       int average = sum / cNum.length;
       System.out.println(average);
    }
}
