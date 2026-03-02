package webbanhang.webbanhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webbanhang.webbanhang.entity.Category;
import webbanhang.webbanhang.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    public boolean existsByName(String name) {
        return categoryRepository.existsByName(name);
    }
}
