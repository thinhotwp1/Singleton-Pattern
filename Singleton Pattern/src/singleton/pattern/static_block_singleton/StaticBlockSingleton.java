/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern.static_block_singleton;

public class StaticBlockSingleton {
    
    private static final StaticBlockSingleton INSTANCE;
 
    private StaticBlockSingleton() {
    }
 
    /*
    * Tạo ra bằng cách instance được tạo trong khối static block của lớp, giúp object được tạo
    * duy nhất 1 lần trước khi phương thức nào khác được gọi, lợi ích là sẽ xử lý nâng cao hơn trong
    * khối tĩnh, ví dụ như xử lý ngoại lệ trước khi tạo instance, nhưng vẫn phải tuân theo các quy tắc
    * của singleton trong các môi trường đa luồng
    * */

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
    
}
