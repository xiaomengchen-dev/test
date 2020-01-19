package com.huifeng.test.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String[] KEYS = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombins(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits != null && digits.length() != 0) {
            combin("", digits, 0, ret);
        }
        return ret;
    }
    private void combin(String prefix, String digits, int offset, List<String> ret) {
        if (offset == digits.length()) {
            ret.add(prefix);
            return;
        }
//        System.out.println(digits.charAt(offset) - '0');
        String letters = KEYS[digits.charAt(offset) - '0'];
        for (char c : letters.toCharArray()) {
            combin(prefix + c, digits, offset + 1, ret);
        }
    }

}

