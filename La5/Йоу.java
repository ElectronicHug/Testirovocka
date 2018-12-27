import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Йоу {
        public static void main(String[] args) {
            LinkedList<String> list_one = new LinkedList<String>();
            list_one.add("List1");
            System.out.println(list_one.get(0));
            list_one.remove(0);

            ArrayList<String> list_two = new ArrayList<>();
            list_two.add("List2");
            System.out.println(list_two.get(0));
            list_two.remove(0);

            TreeSet<String> set_one = new TreeSet<>();
            set_one.add("Set1");
            System.out.println(set_one.first());
            set_one.remove("Set1");

            HashSet<String> set_two = new HashSet<>();
            set_two.add("Set2");
            for (String i : set_two)
                System.out.println(i);
            set_one.remove("Set2");
        }
    }

