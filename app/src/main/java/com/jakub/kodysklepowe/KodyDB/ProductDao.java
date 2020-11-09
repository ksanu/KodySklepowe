package com.jakub.kodysklepowe.KodyDB;


import androidx.room.*;

import java.util.List;


@Dao
public interface ProductDao {
    @Query("SELECT * FROM product")
    List<Product> getAll();

    @Query("SELECT * FROM product WHERE uid IN (:userIds)")
    List<Product> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM product WHERE product_name LIKE :name || '%' LIMIT 3")
    Product findByName(String name);

    @Query("SELECT * FROM product WHERE product_code LIKE :code || '%' LIMIT 3")
    Product findByCode(String code);

    @Query("SELECT * FROM product WHERE product_code LIKE :input || '%' OR " +
            "product_name LIKE :input || '%' LIMIT 3")
    Product findByCodeOrName(String input);

    @Insert
    void insertAll(Product... products);

    @Delete
    void delete(Product code);
}