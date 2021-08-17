import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
