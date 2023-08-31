/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern.doublecheck_singleton;

/**
 * @author Thinh Duy
 */
public class DoubleCheckLockingSingleton {
    
    private static volatile DoubleCheckLockingSingleton instance;
    private String name;

    /*  từ khóa volatile cho phép đồng bộ hóa không đúng cách để double-check locking

    DoubleCheckLockingSingleton ít được dùng ở thời điểm hiện tại: Lý do là vì khi block luồng ở bước 1
    để kiểm tra có null hay không sẽ gây performent trong môi trường đa luồng khi nhiều
    luồng phải đợi chờ kiểm tra, hoặc khi nhiều luồng cùng kiểm tra 1 lúc và thấy class null từ đó tạo
    ra nhiều thể hiện của class, thay vào đó người ta sử dụng các cách an toàn hơn như holder hay eager
    trong môi trường đa luồng
    */

    private DoubleCheckLockingSingleton() {
    }
 
    // check 2 lần, nếu instance = null check thêm sync xem nếu null nữa thì tạo instance mới
    public static DoubleCheckLockingSingleton getInstance() {

        if (instance == null) {
            // check xem null không
            synchronized (DoubleCheckLockingSingleton.class) {
                // sau khi sync check xem null không lần nữa
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
