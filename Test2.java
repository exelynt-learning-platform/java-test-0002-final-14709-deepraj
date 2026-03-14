
public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            
            for (int s = 0; s < (5 - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.print(i);
            for (int j = i - 1; j > 1; j--) {
                System.out.print(" " + j);
            }
            if (i > 1) {
                System.out.print(" 1");
            }
            System.out.println();
        }
    }
}
