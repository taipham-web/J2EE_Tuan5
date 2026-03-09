package webbanhang.webbanhang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// Vô hiệu hóa User entity vì bảng users không tồn tại trong DB
// @Entity
// @Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // @NotBlank(message = "Vui lòng nhập họ và tên")
    // @Size(min = 2, max = 100, message = "Họ và tên phải từ 2 đến 100 ký tự")
    // @Column(name = "full_name")
    private String fullName;
    
    // @NotBlank(message = "Vui lòng nhập email")
    // @Email(message = "Email không hợp lệ")
    // @Column(name = "email")
    private String email;
}
