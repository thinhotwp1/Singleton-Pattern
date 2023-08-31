/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern.lazy_singleton;

/**
 *
 * @author Administrator
 */
public class ThreadSafeLazyInitializedSingleton {

    /*
    * Được tạo ra với mục tiêu an toàn dữ liệu trong môi trường đa luồng, một cách triển khai
    * cụ thể của Thread Safe Lazy Initialized Singleton là Double Check Locking Singleton, nhưng
    * thường ít được triển khai vì với lợi ích không lớn là giảm được tài nguyên khi không sử dụng
    * nhưng lại mắc phải vấn đề mất đồng bộ trong đa luồng
    * */
    
    private static volatile ThreadSafeLazyInitializedSingleton instance;
 
    private ThreadSafeLazyInitializedSingleton() {
    }
 
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
    
}
