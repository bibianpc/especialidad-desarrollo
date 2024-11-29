package com.mycompany.actividad2;

import com.mycompany.actividad1.ConnectionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainCRUD {
    public void createForm1(ProductEntity productEntity) {
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.doConnectionDb();

            Statement statement = connection.createStatement();
            String querySql = "insert into " + productEntity.getTableName() +
                    " (name,category, stock, lot, price) " +
                    "values ('" + productEntity.getName() + "','"
                    + productEntity.getCategory() + "',"
                    + productEntity.getStock() + ","
                    + productEntity.getLot() + ","
                    + productEntity.getPrice()
                    + ");";

            statement.executeUpdate(querySql);
            System.out.println("producto creado ");
            connection.close();

        } catch (Exception e) {
            System.err.println("Error al insertar un producto" + e.getMessage());
        }
    }



    public void update (ProductEntity productEntity) {
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.doConnectionDb();
            Statement statement = connection.createStatement();

            String querySql = "insert into "+productEntity.getTableName()+" (name,category, stock, lot, price) "+
                    "values ('"
                    +productEntity.getName()+"','"
                    +productEntity.getCategory()+"',"
                    +productEntity.getStock()+","
                    +productEntity.getLot()+","
                    +productEntity.getPrice()
                    +");";

            statement.executeUpdate(querySql);
            System.out.println("producto creado ");
            connection.close();
        } catch (Exception e) {
            System.err.println("Error al insertar un producto" + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.doConnectionDb();
            String queryDelete = ("DELETE FROM product WHERE category = ?");

            PreparedStatement preparedStatement = connection.prepareStatement(queryDelete);
            preparedStatement.setString(1, "pet");
            var result = preparedStatement.executeUpdate();
            var valor = String.valueOf(result);
            if (result > 0) {
                // System.out.println("se borraron " + result +" en la base de datos");
                System.out.println(String.format("se borraron %i en la base de datos", valor));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ProductEntity> find() {
        List<ProductEntity> productEntityList = new ArrayList<>();
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.doConnectionDb();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet resultSet = statement.executeQuery(sql);
            var meta= resultSet.getMetaData();
            var numeroColumns = meta.getColumnCount();
            System.out.println("la cantidad de columnas numeroColumns");

            while (resultSet.next()) {
                ProductEntity product = new ProductEntity();
                product.setIdProduct(resultSet.getString("id_product"));
                product.setName(resultSet.getString("name"));
                product.setCategory(resultSet.getString("category"));
                product.setStock(resultSet.getInt("stock"));
                product.setLot(resultSet.getInt("lot"));
                product.setPrice(resultSet.getDouble("price"));
                productEntityList.add(product);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            return productEntityList;
        }
    }
}
