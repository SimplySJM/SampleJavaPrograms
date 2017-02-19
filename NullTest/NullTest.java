class Demo {

    public void test(String s) {
        System.out.println("String Test");
    }

   /* public void test(StringBuilder s) {
        System.out.println("String Builder Test");
    }*/

    public void test(Object o) {
        System.out.println("Object Test");
    }
}

public class NullTest {
    /**
     * case 1 : If you run this program as it is, it gives you "String Test" output
     * Why : Because the Java compiler picks the most specific overload
     *
     * Case 2: If you uncomment commented method it gives
     * "reference to test is ambiguous error"
     * Why : Because both methods are applicable, but neither String nor StringBuilder
     * is more specific than the other, therefore it throws compiler error.
     */
    public static void main(String args[]) {
        Demo d = new Demo();
        d.test(null);
    }
}