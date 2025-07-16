// 14. Calculate Sum of Squares of First N Numbers

public class Square {
    public static int sumSquares(int n) {
        if (n == 0) return 0;
        return n * n + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(3)); // 1^2 + 2^2 + 3^2 = 14
    }
}
