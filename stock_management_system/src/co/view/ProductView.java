package co.view;

import co.model.Product;

import java.util.List;

public class ProductView {

    public static void printProductList(List<Product> products) {
        System.out.println("=".repeat(10) + "Product List" + "=".repeat(10));
        products.forEach(product -> {
            System.out.println("ID:" + product.getId());
            System.out.println("Name:" + product.getName());
            System.out.println("Price:" + product.getPrice());
            System.out.println("Qty:" + product.getQty());
            System.out.println("ImportDate:" + product.getImportedDate());
        });
    }
    public static void printUpdateProduct(Product product) {
        System.out.println("=".repeat(10) + "Updated Product" + "=".repeat(10));
        System.out.println("ID:" + product.getId());
        System.out.println("Name:" + product.getName());
        System.out.println("Price:" + product.getPrice());
        System.out.println("Qty:" + product.getQty());
        System.out.println("ImportDate:" + product.getImportedDate());
    }

    public static void printInsertProdcut(Product product) {

        System.out.println("=".repeat(10) + "Create Product" + "=".repeat(10));
        System.out.println("ID:" + product.getId());
        System.out.println("Name:" + product.getName());
        System.out.println("Price:" + product.getPrice());
        System.out.println("Qty:" + product.getQty());
        System.out.println("ImportDate:" + product.getImportedDate());
    }
}
