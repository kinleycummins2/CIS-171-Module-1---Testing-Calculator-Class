public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 4;
        int b = 2;

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));
    }
}