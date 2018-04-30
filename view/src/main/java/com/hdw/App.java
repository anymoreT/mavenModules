package com.hdw;

/**
 * Hello world!
 *
 */
import com.hdw.Control;
import com.hdw.dao.Dao;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Control().printControl();
        new Dao().printDao();
    }
}
