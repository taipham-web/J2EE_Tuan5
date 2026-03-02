package webbanhang.webbanhang.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Vui lòng nhập tên sản phẩm")
    @Size(min = 2, max = 255, message = "Tên sản phẩm phải từ 2 đến 255 ký tự")
    @Column(name = "name")
    private String name;
    
    @NotNull(message = "Vui lòng nhập giá sản phẩm")
    @DecimalMin(value = "1", inclusive = true, message = "Giá sản phẩm phải từ 1 trở lên")
    @DecimalMax(value = "9999999", inclusive = true, message = "Giá sản phẩm không được vượt quá 9,999,999")
    @Column(name = "price")
    private BigDecimal price;
    
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "short_description")
    private String shortDescription;
    
    @Column(name = "image_url")
    private String imageUrl;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "category_name")
    private String categoryName;
}
