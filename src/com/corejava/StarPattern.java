public class StarPattern {
    // Ascending Pattern
    public static void rightAnglePattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // symmetric Triangle
    public static void symmetricTrianglePattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted symmetric Triangle
    public static void invSymmetricTrianglePattern(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarPattern.symmetricTrianglePattern(4);
    }
}
