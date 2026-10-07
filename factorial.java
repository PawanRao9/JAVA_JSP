public class factorial {
    static int printFactorial(int n) {
        int fact = 1;
        while(n>=1){
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + printFactorial(5));
        System.out.println("Factorial of 10 is " + printFactorial(10));
        System.out.println("Factorial of 15 is " + printFactorial(15));

        for (int a = 1; a <= 10; a++) {
            System.out.println("Factorial of " + a + " is " + printFactorial(a));
        }
    }
}
