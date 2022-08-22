import java.util.Scanner;

public class App {
    public int sum(int a, int b) {
        return a+b;
    }
    public double sum(double a, double b) {
        return a+b;
    }
    public double sum(int a, Double b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner so1 = new Scanner(System.in);
        Scanner so2 = new Scanner(System.in);
        App obj = new App();
        System.out.println(obj.sum(so1.nextInt(), so2.nextInt()));
        System.out.println(obj.sum(so1.nextDouble(), so2.nextDouble()));
        System.out.println(obj.sum(so1.nextInt(), so2.nextDouble()));
    }
}
