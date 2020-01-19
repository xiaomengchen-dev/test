package com.huifeng.test;

import static org.junit.Assert.assertTrue;

import com.huifeng.test.service.MainFactory;
import com.huifeng.test.service.impl.Main;
import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**JUNIT TEST for mini-test
     *  scanner can only be used in main function
     */
    @Test
    public static void main(String[] args) {
        //Main test2 = new Main();
        MainFactory<Main> mainFactory = Main::new;
        Main test2 = mainFactory.create();
        //System.out.println(test2.letterCombins("23"));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println(test2.letterCombins(s));
        }
    }



}
