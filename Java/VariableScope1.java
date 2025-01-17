
// 6. Program to check access of local variable to global
class VariableScope1 {
    int globalVar = 100; // Global variable

    public void method() {
        int localVar = 50; // Local variable
        System.out.println("Global Variable: " + globalVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.method();
    }
}

