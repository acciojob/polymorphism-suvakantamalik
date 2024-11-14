package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2, 3);
        p.product(1.2,2.4);

        System.out.println(p.product(1,2));
        System.out.println(p.product(1,2, 3));
        System.out.println(p.product(1.2,2.4));
    }
}
class Product {
    public int product(int x, int y){
        return x * y;
    }
    public int product(int x, int y, int z) {
        return x * y * z;
    }
    public double product(double x, double y) {
        return x * y;
    }
}
