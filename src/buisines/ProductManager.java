package buisines;

import core.logging.Logger;
import dataAccsess.ProductDao;
import entiti.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Mehsulun qiymeti 10-Azn den az ola bilmez.");

        }
        productDao.add(product);

        for (Logger loggers : loggers) {
            loggers.log(product.getName());
        }

//        ProductDao productDao = new JdbcProductDao();
//        productDao.add(product);
    }
}
