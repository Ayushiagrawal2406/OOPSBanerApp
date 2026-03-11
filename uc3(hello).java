public class UC3DisplayNameDefault {
    public static void main(String[] args) {
        // Check if user provided a name
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello " + name);
    }
}