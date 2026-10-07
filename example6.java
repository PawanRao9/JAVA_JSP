// square
public class example6 {
    static int square(int n) {
        int aq = n * n;
        return aq;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + ": " + square(i));
        }
    }
}
 