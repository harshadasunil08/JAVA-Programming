class OperatorPresedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 20, b = 10;
        System.out.println(a+b*10);   //Precedence
        System.out.println(a+b-10);   //Left to Right Associativity
        System.out.println(++a);      //Right to Left Associativity
        System.out.println(b++);      //Right to Left Associativity
    }
}
