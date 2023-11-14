package co.dao;

import co.database.ProductDataBase;
import co.exception.ProductNotFoundException;
import co.model.Product;
import co.singleton.Singleton;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class ProductDaoimpl implements ProductDao {
    private ProductDataBase productDataBase;

    public ProductDaoimpl() {
        productDataBase = Singleton.productDataBase();
    }

    @Override
    public Product insert(Product product) {
        productDataBase.getProducts().add(product);
        return product;
    }

    @Override
    public List<Product> select() {
        return productDataBase.getProducts();
    }

    @Override
    public Optional<Product> selectById(Long id) {
        return productDataBase.getProducts().stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    @Override
    public Product updateById( Product product) {
        return productDataBase.getProducts().stream().
                filter(pro -> pro.getId().equals(product.getId()))
                .map(newPro -> product).findFirst()
                .orElseThrow(() -> new ProductNotFoundException(String.format("Product ID = %s does not exit in DB!", product.getId())));
    }

    @Override
    public Product deleteById(Long id) {
        Product foundProduct = productDataBase
                .getProducts().stream()
                .filter(pro -> pro.getId().equals(id))
                .findFirst().orElseThrow(() -> new ProductNotFoundException(String.format("Product ID = %s does not exit in DB!", id)));
        productDataBase.getProducts().remove(foundProduct);
        return foundProduct;
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDataBase.getProducts().stream().filter(pro -> pro.getName().toLowerCase().contains(name.toLowerCase())).toList();
    }

}
