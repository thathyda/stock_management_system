package co.singleton;

import co.controller.ProductController;
import co.dao.ProductDaoimpl;
import co.database.ProductDataBase;
import co.model.Product;
import co.service.ProductService;
import co.service.ProductServiceImpl;

import java.util.Scanner;

public class Singleton {
    private static ProductDataBase productDataBase;
    private static Scanner scanner;
    private static ProductController proContoller;
    private static ProductServiceImpl proService;
    private static ProductDaoimpl productDaoimpl;
    private static Product product;

    public static Scanner scanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static ProductController productController() {
        if (proContoller == null) {
            proContoller = new ProductController();
        }
        return proContoller;
    }

    public static ProductServiceImpl productService() {
        if (proService == null) {
            proService = new ProductServiceImpl();
        }
        return proService;
    }

    public static ProductDaoimpl productDaoimpl() {
        if (productDaoimpl == null) {
            productDaoimpl = new ProductDaoimpl();
        }
        return productDaoimpl;
    }

    public static ProductDataBase productDataBase() {
        if (productDataBase == null) {
            productDataBase = new ProductDataBase();
        }
        return productDataBase;
    }

    public static Product products() {
        if (product == null) {
            product = new Product();
        }
        return product;
    }

}
