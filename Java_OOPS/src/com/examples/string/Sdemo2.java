package com.examples.string;
class Sdemo2
{
    public static void main(String args[])
    {
     int idno=102;
     String name="smith";
     float sal=1400;
    String s="insert into my emp values ( "+ idno +" , \""+ name +"\", "+ sal +" )";
    System.out.println(s);
    }
}
