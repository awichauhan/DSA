public class IndirectRecursion
{
    public static void functionA(int n) {
        if (n <= 0) return;
        System.out.println("A: " + n);
        functionB(n - 1); // Calls functionB
    }
    public static void functionB(int n) {
        if (n <= 0) return;
        System.out.println("B: " + n);
        functionA(n - 2); // Calls functionA
    }

    public static void main(String[] args) {
        functionA(5);
    }
}
