package mate.academy.springboot.datajpa.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import mate.academy.springboot.datajpa.model.Product;

public interface ProductService extends GenericService<Product> {
    List<Product> getAllBetweenPrice(BigDecimal minPrice, BigDecimal maxPrice);

    List<Product> findAll(Map<String, String> params);

    List<Product> getAllProducts();
}