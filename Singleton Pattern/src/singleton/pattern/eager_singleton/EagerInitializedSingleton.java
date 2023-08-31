/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern.eager_singleton;

import lombok.Data;
/**
 * @author Thinh Duy
 */
@Data
public class EagerInitializedSingleton {
    // tạo luôn từ đầu và sẽ chạy cùng chương trình, nếu không tốn kém tài nguyên thì dùng
    // TSDC đang dùng cách này ở file log, config, ...

    /* Nhược điểm là gây tốn bộ nhớ, vì thể hiện được tải ngay vào lúc khởi động chương trình,
    nên sử dụng với những object nhỏ hoặc với những object được sử dụng thường xuyên
    và xuyên suốt vòng đời của ứng dụng như logging, config */

    /* Tuy nhiên, nếu tiêu tốn bộ nhớ là một vấn đề đối với ứng dụng của bạn,
    bạn có thể cân nhắc sử dụng Lazy Initialized Singleton hoặc các triển khai khác
    của Singleton Pattern như Holder Singleton hoặc Enum Singleton. Những cách triển khai
    này tạo thể hiện duy nhất chỉ khi cần thiết, giúp tiết kiệm bộ nhớ và tối ưu hóa hiệu suất.*/
    
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private String name;
 
    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
         
    }
    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
    
}
