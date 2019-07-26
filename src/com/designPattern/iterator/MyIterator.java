package com.designPattern.iterator;

public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    Object getCurrentObj();
}
