package com.learn.designpatterns.solid.ocp.refactored;

public class OrSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public OrSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) || second.isSatisfied(item);
    }
}
