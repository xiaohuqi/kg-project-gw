package com.hiekn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String input = "1234 4568 90ab";
        System.out.println(input.lastIndexOf(" ", input.length() - 1));
    }
}
