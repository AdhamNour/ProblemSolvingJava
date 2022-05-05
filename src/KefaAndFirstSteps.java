import java.util.ArrayList;
import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count=1;
        Integer result = 1;
        Integer prev = null;
        Integer n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(i==0) {
                prev = scanner.nextInt();
                continue;
            }
            Integer x = scanner.nextInt();
            if(x.compareTo(prev)>=0){
                count++;
            }
            else{
                count=1;
            }
            result=Math.max(result,count);
            prev=x;

        }
    System.out.println(result);

    }
}

