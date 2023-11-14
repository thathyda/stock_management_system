package co.service;

import co.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product insert(Product product);

    List<Product> select();

    Product selectById(Long id);

    Product updateById( Product product);

    Product deleteById(Long id);

    List<Product> selectByName(String name);
}
