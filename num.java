// 2. Print Numbers from N to 1

public class num {
    public static void num(int n) {
        if (n == 0) return;
        System.out.println(n);
        num(n - 1);
    }

    public static void main(String[] args) {
        num(5);
    }
}