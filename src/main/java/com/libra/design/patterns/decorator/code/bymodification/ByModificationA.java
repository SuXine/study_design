package com.libra.design.patterns.decorator.code.bymodification;

import com.libra.design.patterns.decorator.code.AbsByModification;

public class ByModificationA extends AbsByModification {
    @Override
    public void Operation() {
        System.out.println("我是被装饰者A - 我将进行默认操作");
    }
}
