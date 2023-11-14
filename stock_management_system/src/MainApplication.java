
    /*MVC
     * M= model
     *   - DAO : Data Access Object
     *   - CO_Cs-tad.Service Implement
     *       * CO_Cs-tad.Service interface
     *       * ServiceImpl
     *   - DTO : Data Transfer Object
     * V = CO_Cs-tad.View
     * C = Controller (Dispatcher Servlet)
     * General : base Path term Architecture
     * Lom book bowlderPlatCode  */


    import co.controller.MenuController;
import co.controller.ProductController;
import co.service.ProductServiceImpl;
import co.singleton.Singleton;

import java.util.Scanner;

public class MainApplication {
    private final Scanner sc;
    private final ProductController proContoller;
    private final ProductServiceImpl proServiceImpl;

    public MainApplication() {
        sc = Singleton.scanner();
        proContoller = Singleton.productController();
        proServiceImpl = Singleton.productService();
    }

    private void run() {
        MenuController.index();
        while (true) {
            System.out.print("Enter Option: ");
            int option = Integer.parseInt(sc.next());
            switch (option) {
                case 1 -> proContoller.listPro();
                case 2 -> proContoller.addPro();
                case 3 -> proContoller.deleteById();
                case 4 -> proContoller.updateById();
                default -> throw new IllegalArgumentException();
            }
        }
    }
    public static void main(String[] args) {
        new MainApplication().run();
    }
}
