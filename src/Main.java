public class Main {
   // 2. feladat: A main függvényben írasd ki a hárommal osztható páros számokat egy sorba!
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
        // 4. feladat: Készíts egy függvényt, ami egy számokkal feltöltött tömböt vár paraméterül.
        // A függvény adja vissza a tömbben található legnagyobb páros számot!

        int[] numbers = {1, 5, 8, 9, 12, 4, 7};             // 1D tömb létrehozása(numbers) és feltöltése számokkal
        int largestEven = findLargestEven(numbers);         // findLargestEven függvényt meghívjuk a numbers tömbön és az eredményt eltároljuk a largestEven változóban
        System.out.println();
        System.out.println("A tömbben található legnagyobb páros szám: " + largestEven);
    }

    public static int findLargestEven(int[] array) {        // ez a metódus találja meg a legnagyobb páros számot a tömbben
        int largestEven = Integer.MIN_VALUE;                // a legkisebb int típusú értéket jelenti -> legkisebb érétékre állítjuk a vátozót

        for (int number : array) {                          // for-each ciklus végig járunk az array tömb elemein-> int number tárolja el az elemet
            if (number % 2 == 0 && number > largestEven) {  // ezzel ellenőrizzük, hogy az aktuális szám páros és nagyobb e, int a tárolt largestEven változ értéke
                largestEven = number;
            }
        }

        return largestEven;
    }
    public class Calculator {

        public static void main(String[] args) {
            int result1 = power(2, 3);
            int result2 = subtract(10, 5);
            int result3 = add(7, 3);

            System.out.println("Hatványozás: " + result1);
            System.out.println("Kivonás: " + result2);
            System.out.println("Összeadás: " + result3);
        }

        public static int power(int base, int exponent) {
            return (int) Math.pow(base, exponent);
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int add(int a, int b) {
            return a + b;
        }
    }
}


