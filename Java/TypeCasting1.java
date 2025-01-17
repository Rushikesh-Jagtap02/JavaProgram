
// 5. Program to apply implicit and explicit casting
class TypeCasting1 {
    public static void main(String[] args) {
        // Implicit casting
        int num = 100;
        double implicitCast = num;
        
        // Explicit casting
        double decimal = 99.99;
        int explicitCast = (int) decimal;

        System.out.println("Implicit Casting (int to double): " + implicitCast);
        System.out.println("Explicit Casting (double to int): " + explicitCast);
    }
}

