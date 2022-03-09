package com.learn.designpatterns.solid.isp;

public interface Machine {
    void print(Document document);

    void fax(Document document);

    void scan(Document document);
}
