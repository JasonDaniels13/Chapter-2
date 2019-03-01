
import java.util.*;

public class CollectionClass {


    public static void main(String[] args) {
        new CollectionClass();
            }


    private static final String [] names = {"Jason","Amanda","Kate","Jason","Robert","Adam","Amanda"};

    public CollectionClass() {

        List<String> list = new ArrayList<>();
        for(String name : names)
            list.add(name);

        System.out.println("My Collections List of names are: " );

        for(int i = 0; i < list.size();i++)
            System.out.printf("%s: ", list.get(i));

        uniqueNames(list);

    }
    private void uniqueNames(Collection<String >collection){
        Set<String> set = new HashSet<>(collection);

        System.out.println("\n\n"+"My unique Set of names are: ");

        for (String uniqueListofNames : set)

            System.out.printf("%s ",uniqueListofNames);

    Map colors  = new HashMap();

    colors.put("Red",5);
    colors.put("Blue",3);
    colors.put("Green",10);
    colors.put("Pink",2);

        System.out.println("\n\n" + "Total number of MAP colors: " + colors.size());

        for(Object key : colors.keySet())
            System.out.println(key + "-"+ colors.get(key));

        System.out.println();

    }






}



