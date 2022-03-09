package com.learn.designpatterns.solid.ocp.refactored;

import com.learn.designpatterns.solid.ocp.Product;
import com.learn.designpatterns.solid.ocp.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
