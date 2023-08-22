import java.util.Scanner;
public class VowelDetector {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = s1.toLowerCase();
        int count = 0 ;
    for (int i =0 ;i<s2.length();i++){
        if(s2.charAt(i)=='a' || s2.charAt(i)=='i' || s2.charAt(i)=='e' || s2.charAt(i)=='o' || s2.charAt(i)=='u'){
            count++;
        }
    }
        System.out.println("Vowel: "+count);

    }

}
