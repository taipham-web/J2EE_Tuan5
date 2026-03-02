package webbanhang.webbanhang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import webbanhang.webbanhang.entity.Category;
import webbanhang.webbanhang.service.CategoryService;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CategoryService categoryService;

    @Override
    public void run(String... args) {
        // Chỉ thêm dữ liệu mặc định nếu bảng categories trống
        if (categoryService.getAllCategories().isEmpty()) {
            List<String> defaultCategories = List.of(
                "Giày bóng đá",
                "Áo bóng đá",
                "Quần bóng đá",
                "Bóng rổ",
                "Giày bóng rổ",
                "Áo bóng rổ",
                "Bóng đá",
                "Phụ kiện thể thao",
                "Tất thể thao",
                "Găng tay thể thao"
            );

            for (String name : defaultCategories) {
                if (!categoryService.existsByName(name)) {
                    Category category = new Category();
                    category.setName(name);
                    categoryService.saveCategory(category);
                }
            }

            System.out.println("✅ Đã khởi tạo " + defaultCategories.size() + " danh mục mặc định.");
        }
    }
}
