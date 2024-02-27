package d28exceptions_enum_iterators;

public class Exception01 {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);
    } //main disi

    public static void getir(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Database ile bağlantıyı kesiniz");
        }
        System.out.println("Merhaba");

        // Coklu finally block kullanilamaz
        //java da try + bir catch, try + birden fazla catch, try + catch + finally,
        // try + finally kullanilabilir.
    }
}
