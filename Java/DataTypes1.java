//1. Program to declare primitive and non-primitive data types
public class DataTypes1 {
    public static void main(String[] args) {
        // Primitive data types
        int age = 25;
        float height = 5.9f;
        char grade = 'A';
        boolean isStudent = true;
        
        // Non-primitive data types
        String name = "John";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("Name: " + name);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
    }
}

