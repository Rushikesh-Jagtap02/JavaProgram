
// 3. Program to create a variable and then convert it into a constant
class VariableToConstant1 {
    public static void main(String[] args) {
        int variable = 10; // Variable
        final int CONSTANT = variable; // Converted to constant

        System.out.println("Variable: " + variable);
        System.out.println("Constant: " + CONSTANT);
    }
}

