import java.util.Scanner;
public class CapiTalize {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String S1[]=s.split(" ");

        for (int i=0 ; i<S1.length;i++){

            String l1;
            l1=S1[i].substring(0,1).toUpperCase();
            l1+=S1[i].substring(1);
            System.out.print(l1+" ");
        }
    }
}
