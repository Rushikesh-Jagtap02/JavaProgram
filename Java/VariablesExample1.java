
// 2. Program to declare instance, static, and local variables
class VariablesExample1 {
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public void method() {
        // Local variable
        int localVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesExample obj = new VariablesExample();
        obj.method();
    }
}

