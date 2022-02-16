public class Test {
    public static void main(String[] args) {
        First first=First.getInstance();
        Second second=Second.INSTANCE;
        second.printName();
        Third third=Third.getInstance();
    }
}
