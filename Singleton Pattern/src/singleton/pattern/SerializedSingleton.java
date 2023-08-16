/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

import java.io.Serializable;

public enum SerializedSingleton implements Serializable {

    /*
    * Được triển khai dựa theo enum, vì phải đáp ứng được khi tuần tự hóa và chuyển thành byte, sau đó
    * được khôi phục lại thì vẫn phải đảm bảo tính chất duy nhất của object, vì vậy nên sử dụng enum
    * để đảm bảo được vấn đề này, nhưng sẽ chấp nhận việc enum sẽ không maintain thêm các lớp con được
    * */

    INSTANCE;

    // Getter and setter methods
    private String name;

    // Constructor
    private SerializedSingleton() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Other methods
    public void doSomething() {
        System.out.println("Name: " + getName());
    }
}
