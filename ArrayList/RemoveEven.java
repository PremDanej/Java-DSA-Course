package ArrayList;

/*
 * Remove all Even Numbers from ArrayList.
 */

import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(15);
        arr.add(8);
        arr.add(21);
        arr.add(3);
        arr.add(2);

        for (int i = arr.size() - 1; i > 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }

        System.out.println(arr);

    }
}
