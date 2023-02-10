/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

/**
 *
 * @author Administrator
 */
public class ThreadSafeLazyInitializedSingleton {
    
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
