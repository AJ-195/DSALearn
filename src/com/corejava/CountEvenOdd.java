public class CountEvenOdd {
    public static void main(String[] args) {
        int[] num = { 100, 201, 31, 50, 60 };

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
    }
}
