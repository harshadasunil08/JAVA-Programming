class NestedIf {
    public static void main(String[] args) {
        int ssc = 60, hsc = 60, cet = 60;
        if (ssc >= 40) {
            if (hsc >=40) {
                if (cet >=40) {
                    System.out.println("Eligible!");
                }
            } 
            else {
                System.out.println("Not Eligible!");
            }
        }
    }
}
