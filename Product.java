// 11. Calculate Product of First N Natural Numbers

public class Product {
    public static int product(int n) {
        if (n <= 1) return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(product(5));
    }
}