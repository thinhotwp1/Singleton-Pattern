package singleton.pattern;

public class HolderSingleton {

    /*  Dựa vào một lớp static khác để tạo "ké" thể hiện duy nhất của class muốn tạo, từ khóa
    private static class SingletonHelper sẽ tạo duy nhất 1 thể hiện trong quá trình chạy chương
    trình, từ đó thể hiện của class BillPughSingleton cũng sẽ được tạo 1 lần duy nhất, đảm bảo được
     sự đồng nhất trong môi trường multi thread */

    private String name;

    private HolderSingleton() {
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}