import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass {


    public static void main(String[] args) {
        new CollectionClass();
    }


    private static final String [] names = {"Jason","Amanda","Kate"};

    public CollectionClass() {

        List<String> list = new ArrayList<>();
        for(String name : names)
            list.add(name);

        for(int i = 0; i < list.size();i++)
            System.out.printf("%s, ", list.get(i));


    }




}



