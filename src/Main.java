import buisines.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccsess.HibernateProductDao;
import entiti.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        Product product1 = new Product(1, "Iphone", 2500);


//        ProductManager productManager = new ProductManager();
//        productManager.add(product1);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new EmailLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}