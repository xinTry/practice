package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void setVector() {
Vector v = new Vector();
        v.add("100");
v.add(new Integer(2));
v.add("300");
Iterator i = v.iterator();
v.remove(0);
while (i.hasNext()) {
System.out.println(i.next().toString());
}
    }

    public static void main(String[] args) {
        //setVector();
        setList();
    }

    public static void setList() {
        List v = new ArrayList();
        v.add("100");
        v.add(new Integer(2));
        v.add("300");
        Iterator i = v.iterator();
        v.remove(0);
        while (i.hasNext()) {
            System.out.println(i.next().toString()+"--------------");
        }
    }
}
