package com.humble.test;

import android.util.Log;

import com.humble.annotation.Service;

/**
 * @author wenlong wang
 * @date 2020/12/1 14:46
 */
@Service(Test.class)
public class TestIMp implements Test {
    @Override
    public void test() {
        Log.e("sssssss", "0000000))))))");
    }
}
