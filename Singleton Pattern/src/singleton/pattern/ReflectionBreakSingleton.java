/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {

        /*
        * Reflection Break Singleton được sinh ra với mục tiêu kiểm thử cũng như test với tác dụng
        * là tạo ra nhiều hơn 1 instance của class singleton dựa vào cơ chế constructors của class
        * , từ đó tạo ra nhiều hơn 1 instance của class singleton, gây mất đồng bộ đa luồng, để ngăn chặn
        * có thể dùng enum singleton or thêm security manager để chặn quyền truy cập constructors
        */

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
