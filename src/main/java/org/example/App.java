package org.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        App app = new App();
        List l=new ArrayList();
        Map m=new HashMap();
        l.add("1");

        String s = ClassLayout.parseInstance(m).toPrintable();
        final long l1 = GraphLayout.parseInstance(app).totalSize();
        System.out.println(l1);
    }
}
