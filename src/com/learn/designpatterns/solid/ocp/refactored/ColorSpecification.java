package com.learn.designpatterns.solid.ocp.refactored;

import com.learn.designpatterns.solid.ocp.Color;
import com.learn.designpatterns.solid.ocp.Product;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
