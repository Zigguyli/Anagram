package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);

        System.out.println(arrayList);

        int index1 = Collections.binarySearch(arrayList, -30);
        System.out.println(index1);


    }

}

class Employee {
    private int id;
    private String name;
    private int salary;
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee {" +
                " id = " + id +
                ", name = " + name + '\'' +
                ", salary = " + salary +
                '}';
    }
}

