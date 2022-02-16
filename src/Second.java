public class Second {

    private Second() {
        System.out.println("Singleton created!");
    }

    public static final Second INSTANCE = new Second();

    public void printName() {
        System.out.println("I am a Singleton!");
    }
}

