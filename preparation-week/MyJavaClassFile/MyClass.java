public class MyClass {

    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Test the sum method
        int result1 = myClass.sum(5, 3);
        System.out.println("Sum: " + result1);

        // Test the concatenate method
        String result2 = myClass.concatenate("Hello, ", "world!");
        System.out.println("Concatenation: " + result2);
    }
}
