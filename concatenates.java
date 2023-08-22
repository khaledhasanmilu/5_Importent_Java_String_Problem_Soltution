import java.util.Scanner;
public class concatenates {
    String s1,s2;
    public void Function(String s1,String s2){
        String s3 = s1.concat(" "+s2);
        System.out.println(s3);
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        concatenates c = new concatenates();
        c.Function(s1,s2);

    }
}
