package com.example.demo.global;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Products;

public class GlobalData {
public static List<Products> cart;
static {
cart=new ArrayList<Products>();
}
}
