public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {4, -2, 7, -3};

        // Events
        ArrayPrinter.printArray(arr);
        System.out.println("It's total sum: " + ArraySum.sumArray(arr));
        System.out.println("It's average: " + ArrayAvg.avgArray(arr));
    }
}
