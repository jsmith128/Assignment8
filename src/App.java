public class App {
    public static void main(String[] args) throws Exception {
        try {
            int input = Integer.parseInt(args[0]);
            System.out.println(fibonacci(input));
        } catch (NumberFormatException e) {
            System.out.println("There was an error parsing your input");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You must provide a command-line integer argument");
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
