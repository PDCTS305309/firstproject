package com.learn.designpatterns.solid.ocp;

import com.learn.designpatterns.solid.ocp.oldway.ProductFilter;
import com.learn.designpatterns.solid.ocp.refactored.AndSpecification;
import com.learn.designpatterns.solid.ocp.refactored.BetterFilter;
import com.learn.designpatterns.solid.ocp.refactored.ColorSpecification;
import com.learn.designpatterns.solid.ocp.refactored.SizeSpecification;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoApplication {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        //List<Product> products = List.of(apple, tree, house);//available in java 9
        List<Product> products = Stream.of(apple, tree, house).collect(Collectors.toList());

        System.out.println("Green Products (old): ");
        ProductFilter productFilter = new ProductFilter();
        Stream<Product> productStream = productFilter.filterByColor(products, Color.GREEN);
        productStream.forEach(System.out::println);

        System.out.println("Green Products (new): ");
        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filter(products, new ColorSpecification(Color.BLUE)).
                forEach(System.out::println);
        System.out.println("Large Blue Products (new): ");
        betterFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(System.out::println);

    }
}
