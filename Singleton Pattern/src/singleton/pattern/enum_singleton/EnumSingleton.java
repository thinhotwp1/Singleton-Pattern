/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern.enum_singleton;

import java.util.Date;

/**
 * @author Thinh Duy
 */
public enum EnumSingleton {

    /* Cách hoạt động: Tạo trường INSTANCE và các trường String hay int sẽ ăn theo INSTANCE này
    của enum, đó là cách để tạo singleton từ enum, có hạn chế là sẽ không extends được enum nên
    không thể mở rộng được các lớp con từ singleton enum */

    INSTANCE;

    private String name;

    // Constructor
    private EnumSingleton() {
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Other methods
    public void doSomething() {
        System.out.println("Name: "+getName());
    }
}
