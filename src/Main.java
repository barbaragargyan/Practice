public class Main {
    public static void main(String[] args) {
        int count = 0;
        // Ciklus, amely az első 10 hárommal osztható páros számot keresi
        for (int i = 1; count < 10; i++) {
            // Ha i páros és hárommal osztható, akkor kiírjuk
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

}