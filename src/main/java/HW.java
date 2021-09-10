import java.io.IOException;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        if (a % 3 == 0){
            System.out.print(a / 3);
        }else {
            System.out.print(a / 3 + 1);
        }
    }
}