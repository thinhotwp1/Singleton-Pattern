/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

/**
 *
 * @author Administrator
 */
public class EagerInitializedSingleton {
    // tạo luôn từ đầu và sẽ chạy cùng chương trình, nếu không tốn kém tài nguyên thì dùng
    // TSDC đang dùng cách này ở file log, config, ...
    
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
 
    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
         
    }
 
    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
    
}
