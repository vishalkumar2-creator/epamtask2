package com.epam.newyeargitfs;
import java.util.*;
import java.util.concurrent.*;
import Sweets.*;
/**
 * Hello world!
 **/
public class App 
{
    public static void main( String[] args )
    {
      System.out.println("new year sweets are:");
      Chocolate ch=new Chocolate(11,"chocolate",1);
      Candy c=new Candy(130,"candy",2);
      Jellybean j=new Jellybean(140,"jellybean",3);
      Marshmallow m=new Marshmallow(120,"Marshmallow",4);
      Cookie ck=new Cookie(45,"Cookie",5);
      System.out.println("before sorting:");
      System.out.println(ch.tostring());
      System.out.println(c.tostring());
      System.out.println(j.tostring());
      System.out.println(m.tostring());
      System.out.println(ck.tostring());
      TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
      tm.put(ch.getweight(), ch.tostring());
      tm.put(c.getweight(), c.tostring());
      tm.put(j.getweight(), j.tostring());
      tm.put(m.getweight(), m.tostring());
      tm.put(ck.getweight(), ck.tostring());      
      System.out.print("sorting by weight:\n");
      for(Map.Entry<Integer, String>e:tm.entrySet())
    	  System.out.println(e.getValue());
    }
}
