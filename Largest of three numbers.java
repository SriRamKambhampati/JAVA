public class Largest {
    public static void main(String[] args) {
        int a = 4, b = 9, c = 2;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }
}
