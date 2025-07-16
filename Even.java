// 9. Print Even Numbers from 2 to N

public class Even {
    public static void printEven(int n) {
        if (n < 2) return;
        printEven(n - 1);
        if (n % 2 == 0)
            System.out.println(n);
    }

    public static void main(String[] args) {
        printEven(10);
    }
}
