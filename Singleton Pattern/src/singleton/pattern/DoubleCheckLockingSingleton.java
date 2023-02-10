/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

/**
 *
 * @author Administrator
 */
public class DoubleCheckLockingSingleton {
    
    private static volatile DoubleCheckLockingSingleton instance;
    //  từ khóa volatile cho phép đồng bộ hóa không đúng cách để double-check locking
 
    private DoubleCheckLockingSingleton() {
    }
 
    // check 2 lần, nếu instance = null check thêm synch xem nếu null nữa thì tạo instance mới
    public static DoubleCheckLockingSingleton getInstance() {
        // Do something before get instance ...
        if (instance == null) {
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (DoubleCheckLockingSingleton.class) {
                // Re-check again. Maybe another thread has initialized before
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        // Do something after get instance ...
        return instance;
    }
    
}
