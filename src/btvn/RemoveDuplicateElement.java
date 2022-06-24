package btvn;

import java.util.*;

public class RemoveDuplicateElement {
    /*
     * VD:
     * Danh sách 1: 1,4,6,9,11,2,7,3,8
     * Danh sách 2: 1,3,2,4,5,10,11,6
     * kq: 1,2,3,4,5,6,7,8,9,10,11
     */

    public static void main(String[] args) {
        clearduplicate();

    }

    public static void clearduplicate() {
        System.out.println("Enter first array (ex: 1,2,3...)");
        List<Integer> list1 = input();
        System.out.println("Enter second array (ex: 1,2,3...)");
        List<Integer> list2 = input();

        Set<Integer> result = new TreeSet<>();
        result.addAll(list1);
        result.addAll(list2);
        System.out.println("Result: ");
        System.out.println(result);
    }

    public static List<Integer> input() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        boolean check = true;
        while (check) {
            String s = sc.nextLine().replaceAll("\\s", "").trim();
            String[] input = s.split(",");
            try {
                for (String string : input) {
                    list.add(Integer.parseInt(string));
                }
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter array again (ex: 1,2,3....)");
            }
        }
        return list;
    }


}
