package com.jakub.kodysklepowe.KodyDB;


import androidx.room.*;

@Entity(tableName = "product")
public class Product {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "product_code")
    public String product_code;

    @ColumnInfo(name = "product_name")
    public String product_name;

    @ColumnInfo(name = "product_image", typeAffinity = ColumnInfo.BLOB)
    public byte[] product_image;
}