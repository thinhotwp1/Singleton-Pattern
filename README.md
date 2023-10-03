10 cách khởi tạo Singleton:
https://gpcoder.com/4190-huong-dan-java-design-pattern-singleton/

Link github Sample:  
https://github.com/thinhotwp1/Singleton-Pattern.git

Link sách dịch:
https://toihocdesignpattern.com/chuong-5-singleton-pattern-chi-1-cho-moi-loai.html

Link drive:
https://docs.google.com/document/d/14b9jVIw7BhLmFF8r-D9EflJG8kWRjxR9X-0jReL0RGQ/edit?usp=sharing

Tóm tắt
Mẫu Singleton đảm bảo bạn có nhiều nhất một instance trong ứng dụng của mình.
Mẫu Singleton cũng cung cấp một điểm truy cập toàn cục cho instance đó.
Việc triển khai Java của mẫu Singleton sử dụng một private constructor, một static method kết hợp với một biến static.
Kiểm tra các hạn chế về hiệu suất và tài nguyên của bạn và cẩn thận chọn một triển khai Singleton thích hợp cho các ứng dụng đa luồng (và chúng ta nên xem xét tất cả các ứng dụng đa luồng!).

:rage3:
Tóm lại: Nếu muốn khởi tạo lazy và an toàn trong đa luồng thì sử dụng Holder Singleton, nếu muốn tạo ngay từ ban đầu và sử dụng nhiều trong suốt quá trình chạy như log thì sử dụng Eager Singleton, nếu muốn sử dụng an toàn trong môi trường đa luồng và không quan tâm tới việc mở rộng các lớp con thì sử dụng Enum Singleton, còn Double Check không nên dùng vì không đảm bảo an toàn đồng bộ đa luồng, và tránh các singleton khỏi Reflection Break Singleton bằng các biện pháp kiểm tra và ngăn chặn, nên sử dụng khai báo instance với volatile để đảm bảo các thay đổi vào biến sẽ được thực hiện ngay lập tức và đồng nhất giữa các luồng.



