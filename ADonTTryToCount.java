import java.util.*;
public class ADonTTryToCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0;i<testcase;i++){
            int xlen  = sc.nextInt();
            int slen = sc.nextInt();
            String x = sc.nextLine();
            String s = sc.nextLine();
            if (x.contains(s))
                System.out.println("0");
        }

    }
}