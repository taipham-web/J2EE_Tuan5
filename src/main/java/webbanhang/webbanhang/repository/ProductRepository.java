package webbanhang.webbanhang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webbanhang.webbanhang.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    List<Product> findByBrand(String brand);
    
    List<Product> findByCategoryName(String categoryName);
    
    List<Product> findByNameContainingIgnoreCase(String name);
}
