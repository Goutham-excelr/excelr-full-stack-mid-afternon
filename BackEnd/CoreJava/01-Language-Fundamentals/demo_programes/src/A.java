class A {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to adjust the number of rows

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
