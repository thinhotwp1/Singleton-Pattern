/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton.pattern;

import singleton.pattern.doublecheck_singleton.DoubleCheckLockingSingleton;
import singleton.pattern.eager_singleton.EagerInitializedSingleton;
import singleton.pattern.enum_singleton.EnumSingleton;
import singleton.pattern.holder_singleton.HolderSingleton;

public class SingletonPatternSample { //
    public static void main(String[] args) {
        /*
         * Ở những ví dụ dưới khi set name ở Singleton1 và lấy name ra ở Singleton2 thì có
         * cùng giá trị là "Thinh Dev", vì cả 2 đều hướng về cùng 1 thể hiện duy nhất của Singleton
         */

        System.out.println("------------------------------------------------");

        System.out.println("Holder Singleton sample:");
        HolderSingleton();
        System.out.println("------------------------------------------------");

        System.out.println("Eager Singleton sample:");
        eagerSingleton();
        System.out.println("------------------------------------------------");

        System.out.println("Enum Singleton sample:");
        enumSingleton();
        System.out.println("------------------------------------------------");

        System.out.println("Double Check Singleton sample:");
        doubleCheckSingleton();
        System.out.println("------------------------------------------------");

        System.out.println("Tóm lại nếu muốn khởi tạo lazy mà an toàn trong đa luồng thì sử dụng Holder Singleton,\nnếu " +
                "muốn tạo ngay từ ban đầu và sử dụng nhiều trong suốt quá trình chạy như log thì sử dụng Eager Singleton,\n" +
                "nếu muốn sử dụng an toàn đa luồng và không quan tâm tới việc mở rộng các lớp con thì sử dụng Enum Singleton,\n" +
                "còn Double Check không nên dùng vì không đảm bảo an toàn đồng bộ đa luồng, và tránh các singleton khỏi\n" +
                "Reflection Break Singleton bằng các biện pháp kiểm tra và ngăn chặn, nên sử dụng khai báo instance với\n" +
                "volatile để đảm bảo các thay đổi vào biến sẽ được thực hiện ngay lập tức và đồng nhất giữa các luồng.");
    }

    private static void HolderSingleton() {
        HolderSingleton holderSingleton1 = HolderSingleton.getInstance();
        HolderSingleton holderSingleton2 = HolderSingleton.getInstance();
        System.out.println("Set name for Enum Singleton 1: Thinh Dev ");
        holderSingleton1.setName("Thinh Dev");
        System.out.println("Get name from Enum Singleton 2: " + holderSingleton2.getName());
    }

    private static void doubleCheckSingleton() {
        DoubleCheckLockingSingleton instanceOne = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton instanceTwo = DoubleCheckLockingSingleton.getInstance();
        System.out.println("Set name for Enum Singleton 1: Thinh Dev ");
        instanceOne.setName("Thinh Dev");
        System.out.println("Get name from Enum Singleton 2: " + instanceTwo.getName());
    }

    private static void eagerSingleton() {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();
        System.out.println("Set name for Eager Singleton 1: Thinh Dev ");
        instanceOne.setName("Thinh Dev");
        System.out.println("Get name from Eager Singleton 2: " + instanceTwo.getName());
    }

    private static void enumSingleton() {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("Set name for Enum Singleton 1: Thinh Dev ");
        enumSingleton1.setName("Thinh Dev");
        System.out.println("Get name from Enum Singleton 2: " + enumSingleton2.getName());
    }
}
