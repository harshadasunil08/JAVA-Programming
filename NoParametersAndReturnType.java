class NoParametersAndReturnType {
    static int add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int result = add();
        System.out.println("Sum: " + result);
    }
}
