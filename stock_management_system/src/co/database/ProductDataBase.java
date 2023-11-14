package co.database;

import co.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    List<Product> products;

    public ProductDataBase() {
        products = new ArrayList<>();
        products.add(new Product(1l, "coca", 10, 2500.0, LocalDate.now()));
        products.add(new Product(2l, "cambodia", 20, 2500.0, LocalDate.now()));
        products.add(new Product(3l, "abc", 30, 2500.0, LocalDate.now()));
        products.add(new Product(4l, "sting", 40, 2500.0, LocalDate.now()));
        products.add(new Product(5l, "boba", 50, 2500.0, LocalDate.now()));
    }

    public List<Product> getProducts() {
        return products;
    }
}
