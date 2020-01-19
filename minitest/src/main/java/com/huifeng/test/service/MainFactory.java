package com.huifeng.test.service;

import com.huifeng.test.service.impl.Main;

public interface MainFactory<M extends Main> {
    M create();
}
