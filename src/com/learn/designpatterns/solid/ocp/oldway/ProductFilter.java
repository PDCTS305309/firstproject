package com.learn.designpatterns.solid.ocp.oldway;

import com.learn.designpatterns.solid.ocp.Color;
import com.learn.designpatterns.solid.ocp.Product;
import com.learn.designpatterns.solid.ocp.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.getColor() == color
                && product.getSize() == size);
    }
}
