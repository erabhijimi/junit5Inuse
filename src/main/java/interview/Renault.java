package interview;

import java.util.HashMap;
import java.util.Map;

public class Renault {
    public static void main(String[] args) {
        System.out.println("19-9-2021");
        Map<Employee, Integer> map = new HashMap<>();
        Employee e1 = new Employee("e123", "Rahul");
                map.put(e1,10);
        Employee e2 = new Employee("e123", "Rahul");
                map.put(e2,20);
        Employee e3 = new Employee("e123", "Rahul");
                Integer i = map.get(e3);
        System.out.println(i);

        //
        String str ="abcd xyzw abbc aabb xxyy";
        String[] strs = str.split(" ");

    }
}
