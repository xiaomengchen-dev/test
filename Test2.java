package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	//use array to match numbers and letters
	private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	//make list store prehaps combination of letters
	public List<String> letterCombins(String digits) {
	    List<String> ret = new ArrayList();
	    if (digits != null && digits.length() != 0) {
	        combin("", digits, 0, ret);
	    }
	    return ret;
	}
	//recursive call
	private void combin(String prefix, String digits, int offset, List<String> ret) {
	    if (offset == digits.length()) {
	        ret.add(prefix);
	        return;
	    }
	    String letters = KEYS[digits.charAt(offset) - '0'];
	    for (char c : letters.toCharArray()) {
	        combin(prefix + c, digits, offset + 1, ret);
	    }
	}
	//TEST
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		System.out.println(test2.letterCombins("58"));
	}
}
