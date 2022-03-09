package com.learn.designpatterns.solid.ocp.refactored;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
