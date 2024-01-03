package com.test_driven;

public class StringCalculator {
    public int add(String equal) throws Exception{
        // String[] factors = equal.split(",");
        // return Integer.valueOf(factors[0]) + Integer.valueOf(factors[1]);
        if(equal.substring(equal.length()-2).equals(",\n")){
            throw new Exception("The input cannot be like \"1,\\n\"");
        }
        String[] factors = equal.split("[,\n]");
        int rt=0;
        for(String num : factors){
            rt+=Integer.valueOf(num);
        }
        return rt;

    }
}
