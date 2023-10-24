package com.testehan.detailedNPE;


public class App 
{
    public static void main( String[] args )
    {
        String s = null;
        s.length();         // NPE contains new helpful information "Cannot invoke "String.length()" because "s" is null"
    }
}
