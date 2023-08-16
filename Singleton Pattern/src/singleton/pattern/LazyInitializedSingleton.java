/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

/**
 *
 * @author Administrator
 */
public class LazyInitializedSingleton {

    /* chỉ gọi đến khi nào cần dùng, không gây tốn tài nguyên nhưng sẽ mất đồng bộ trong
       multithread, double check locking chính là 1 trong các lazy Initialized, khởi tạo lười biếng */
    private static LazyInitializedSingleton instance;
 
    private LazyInitializedSingleton() {
    }
 
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    
}
