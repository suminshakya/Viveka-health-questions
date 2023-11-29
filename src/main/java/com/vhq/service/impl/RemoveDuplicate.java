package com.vhq.service.impl;

import java.util.*;

public class RemoveDuplicate<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if(!contains(e)){
            return super.add(e);
        }
        return false;
    }
}
