public record BooleanLogicalOp() {
    public static void main(String[] args) {
        boolean a = true; 
        boolean b = false;

        System.out.println(a&a); // true
        System.out.println(a&b); // false
        System.out.println(b&b); // false
        System.out.println(a|a); // true
        System.out.println(a|b); // true
        System.out.println(b|b); // false
        System.out.println(a^a); // false
        System.out.println(a^b); // true
        System.out.println(b^b); //false
    }
}
