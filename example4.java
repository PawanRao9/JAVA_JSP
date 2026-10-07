// calculate fare
public class example4 {
    static double fare(double km, char mode) {
        return switch (mode) {
            case 'A' -> km * 12;
            case 'B' -> km * 15;
            case 'C' -> km * 20;
            default -> throw new AssertionError();
        };
    }

    public static void main(String[] args) {
        System.out.println("total fare is : "+fare( 10.0, 'A'));
        System.out.println("total fare is : "+fare(10.0, 'B'));
        System.out.println("total fare is : "+fare(10.0, 'C'));
    }
}
