package com.OrdersAndItems;

import java.util.ArrayList;

/**
 * Class to handle new order creation
 * @author alanlytton
 */
public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();
}
