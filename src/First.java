public class First {
    private static First instance;

    private First() {
        System.out.println("First singleton");
    }

    public static First getInstance() { // #3
        if (instance == null) {        //если объект еще не создан
            instance = new First();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}

