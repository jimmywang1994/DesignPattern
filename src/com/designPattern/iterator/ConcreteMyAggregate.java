package com.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public MyIterator createIterator(){
        return new ConcreIterator();
    }

    public void addObj(Object obj) {
        this.list.add(obj);
    }

    public void removeObj(Object obj) {
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    /**
     * 自定义内部类
     */
    private class ConcreIterator implements MyIterator {

        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor<list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
