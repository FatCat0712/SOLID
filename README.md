### Lập trình hướng đối tượng
- OOP (Object Oriented Programming) là một triết lý thiết kế chương trình.
- Tất cả mọi thứ trong OOP đều là "đối tượng". Một chương trình phần mềm được coi như là một thế giới bao gồm các đối tượng tương tác với nhau.
- Mã lệnh và dữ liệu được kết hợp trong một thể thống nhất - đó là đối tượng.
- Đối tượng bao gồm:
  - Thuộc tính: các dữ liệu, tính chất của đối tượng
  - Hành vi: các khả năng, hành động mà đối tượng có thể thực hiện.
### Thế nào là một mã nguồn tốt ?
- Đơn giản
- Trực tiếp
- Dễ đọc hiểu
- Có ít phụ thuộc
- Không có code lặp
- Chạy tất cả các bài kiểm thử
- Không làm mờ đi ý định của người viết.
- Giống một bài văn hay
- Giống như là được viết ra bởi một người có tâm.
### S.O.L.I.D
- SOLID là viết tắt của các từ:
- **S** - Single Responsiblity principle (nguyên lý trách nhiệm duy nhất)
- **O** - Open-close principle (nguyên lý đóng mở)
- **L** - Liskov substitution principle (nguyên lý thay thế Liskov)
- **I** - Interface segregation principle (nguyên lý phân tích Interface)
- **D** - Dependency Inversion principle (nguyên lý đảo ngược phục thuộc)
- SOLID bao gồm các nguyên lý quan trọng bậc nhất cần tuân thủ khi thiết kế kiến trúc phần mềm nhằm đạt được mục đích:
  - Dễ mở rộng
  - Dễ bảo trì
### Single-responsibilty principle
- Nguyên lý trách nhiệm duy nhất
- Mỗi lớp chỉ nên đảm nhiệm một nhiệm vụ duy nhất
- Lý do:
  - Dễ quản lý mã nguồn
  - Các lớp tập trung vào nhiệm vụ của mình
  - Giảm tính phụ thuộc giữa các thành phần
  - Có thể phát triển đồng thời các lớp độc lập với nhau
  - Dễ dàng mở rộng
  - Dễ dàng bảo trì
### Open-closed principle
- Nguyên lý đóng mở
- Các đối tượng (hoặc thực thể) nên mở đối với việc mở rộng, nhưng đóng đối với việc thay đổi
- Nghĩa là: có thể dễ dàng mở rộng một lớp mà không cần thay đổi mã nguồn của lớp đó
- Lí do:
  - Dễ mở rộng
  - Dễ thay đổi
### Liskov substitution principle
- Các lớp con có thể được sử dụng thay thế cho các lớp cha
- Nghĩa là: Nếu S là một lớp con của T, thì các đối tượng của lớp T có thể được thay thế bằng các đối tượng của
  lớp S mà không làm ảnh hưởng tới bất kì hành vi nào của hệ thống
- Lí do:
  - Tránh sai sót khi mở rộng thiết kế
### Interface segregation principle
- Không nên bắt buộc phải triển khai một Interface nếu không cần đến nó, cũng không nên bắt buộc phải phụ thuộc
  vào các phương thức mà không cần đến chúng.
- Nghĩa là: các Interface chỉ nên chứa các phương thức cần thiết vừa đủ với mục đích của nó. Nên tách các interface
  thành nhiều Interface nếu các phương thức của chúng không liên quan chặt chẽ đến nhau.
### Dependency Inversion Principle
- Trừu tượng (abstraction) không nên phục thuộc vào chi tiết. Chi tiết nên phụ thuộc vào trừu tượng.
- Các module ở mức trên không nên phụ thuộc vào các module ở mức dưới, mà cả hai nên phụ thuộc vào trừu tượng (abstraction).

