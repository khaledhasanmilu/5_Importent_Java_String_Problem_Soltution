import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter find word: ");
        String s2=scanner.next();
        System.out.print("Replace into: ");
        String s3 = scanner.next();

        String s4 = s1.replaceAll(s2,s3);
        System.out.println("Previous String: "+s1);
        System.out.print("After Replacing Target word String: "+s4);
        scanner.close();
    }
}
