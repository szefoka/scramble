/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Manipulator {
    private String input;
    
    public Manipulator (String input) {
        this.input = input;
    }
    
    public ArrayList<String> Manipulate () {
        ArrayList<String> stringList = new ArrayList<String>();
        for(String item : input.split("\\s+")) {
            String manipuletd = item.substring(1, item.length()-1);
            stringList.add(item.substring(0, 1) + new StringBuilder (manipuletd).reverse().toString() + item.substring(item.length()-1));
        }
        return stringList;
    }
}
