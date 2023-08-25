import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        LinkedList list3 = new LinkedList();
        LinkedList<Integer> list4 = new LinkedList<Integer>();

        list1.add("Hello");
        list1.add(23);
        list1.add(34.45f);
        list1.add(true);

        list2.add(23);
        list2.add(33);
        list2.add(34);

        list3.add("Hello");
        list3.add(23);
        list3.add(34.45f);
        list3.add(true);

        list4.add(50);
        list4.add(60);

        System.out.println("List1 is : " + list1);
        System.out.println("List2 is : " + list2);
        System.out.println("List3 is : " + list3);
        System.out.println("List4 is : " + list4);

        // * Converting ArrayList to Array */

        Object[] list5 = list2.toArray();
        System.out.println("List5 : ");

        // * For Each Loop */
        for (Object i : list5) {
            System.out.print(i + " ");
        }
        // * For loop */
        System.out.println();
        for (int i = 0; i < list5.length; i++) {
            System.out.print(list5[i] + " ");
        }

        // * Converting ArrayList to Array Method 2 */

        Integer[] list6 = new Integer[list4.size()];
        list6 = list4.toArray(list6);
        System.out.println();
        System.out.println("List6 : ");
        for (Object i : list6) {
            System.out.print(i + " ");
        }

        int[] list7 = { 1, 2, 3, 4, 5, 6 };
        ArrayList<Integer> list8 = new ArrayList<Integer>();

        for (int i : list7) {
            list8.add(i);
        }
        // ArrayList list8 = Arrays.asList(list7);
        System.out.println(list7);
        System.out.println("List 8 : " + list8);
    }
}
