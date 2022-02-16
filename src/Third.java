public class Third {
    private static volatile Third instance;

    private Third() {
        System.out.println("Third variation");
    }

    public static Third getInstance() {
        if (instance == null) {
            synchronized (Third.class) {
                if (instance == null) {
                    instance = new Third();
                }
            }
        }
        return instance;
    }
}

