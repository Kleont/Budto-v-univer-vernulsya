package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColors();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printColors() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value <= 100){
            System.out.println("Yellow");
        }
        else if (value > 100){
            System.out.println("Green");
        }
    }
    public static void checkSumSign() {
        int a = 6; // add " - "(minus) to check for negative result
        int b = 3;
        int c = a + b;
        if (c > 0) {
        System.out.println("Sum is positive");
        }
        else {
        System.out.println("Sum is negative");
        }
    }
    public static void compareNumbers() {
        int a = 4;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a < b){
            System.out.println("a < b");
        }
    }
}
