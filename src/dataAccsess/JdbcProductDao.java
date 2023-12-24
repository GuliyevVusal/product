package dataAccsess;

import entiti.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product) {
        System.out.println("Added to database with JDBC:");
    }
}
