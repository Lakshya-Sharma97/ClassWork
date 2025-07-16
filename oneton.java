// 3. Print Numbers from 1 to N

public class oneton {
    public static void num2(int n, int i) {
        if (i > n) return;
        System.out.println(i);
        num2(n, i + 1);
    }

    public static void main(String[] args) {
        num2(5, 1);
    }
}
