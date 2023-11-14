package co.service;

import co.dao.ProductDao;

import co.exception.ProductNotFoundException;
import co.model.Product;
import co.singleton.Singleton;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    public ProductServiceImpl() {
        productDao = Singleton.productDaoimpl();
    }

    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id).orElseThrow(() -> new ProductNotFoundException(String.format("Product ID = %s does not exit in DB!", id)));
    }

    @Override
    public Product updateById(Product product) {
        return productDao.updateById(product);
    }

    @Override
    public Product deleteById(Long id) {
        return productDao.deleteById(id);
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDao.selectByName(name);
    }
}
