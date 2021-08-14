package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        checkSum(5, 17);
        System.out.println(checkSum(5, 17));
        positiveNumber(5);
        isIntegerNumber(-10);
        printNTimes("GG WP", 5);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arrLenAndInitialValue(4, 5);
    }
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void positiveNumber(int a){
        if (a >= 0){
            System.out.println("Positive number");
        }else{
            System.out.println("Negative number");
        }
    }
    public static boolean isIntegerNumber(int a) {
        if (a >= 0){
            return false;
        }else{
            return true;
        }
    }
    public static void printNTimes(String word, int a) {
        for (int i = 1; i <= 5; i++ ) {
            System.out.println(word);
        }
    }
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1,};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
                System.out.println(arr[i]);
            }else{
                arr[i] = 1;
                System.out.println(arr[i]);
            }
        }
    }
    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
    public static void changeArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
                System.out.println(arr[i]);
            }else{
                System.out.println(arr[i]);
            }
        }
    }
    public static void fillDiagonal(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++){
            arr[i][i] = 1;
            arr[i][5 - 1 - i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    public static void arrLenAndInitialValue(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }
}
