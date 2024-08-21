package Constructor;

public class polo {
    public static void main(String[] args) {
        fonky xObject = new fonky();
        fonky xObject2 = new fonky(5);
        fonky xObject3 = new fonky(3, 40);
        fonky xObject4 = new fonky(8, 25, 50);
        System.out.printf("%s\n", xObject.Military());
        System.out.printf("%s\n", xObject2.Military());
        System.out.printf("%s\n", xObject3.Military());
        System.out.printf("%s\n", xObject4.Military());
    }
}
