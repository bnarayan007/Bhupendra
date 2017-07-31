import java.util.Scanner;
public class string8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String input = in.nextLine();
        char process[] = input.toCharArray();
        boolean status = false;
        int index = 0;
        for (int i = 0; i < process.length; i++) {
            for (int j = i+1; j < process.length; j++) {
                if (process[i] == process[j]) {
                    status = false;
                    break;
                } else {
                    status = true;
                    index = i;
                }
            }
            if (status) {
                System.out.println("First non-repeated string is : " + process[index] + " INDEX " + index);
                break;
            }
        }
    }
}