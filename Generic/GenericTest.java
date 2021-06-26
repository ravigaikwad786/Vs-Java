package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer> mygen = new GenericClass<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);

        mygen.setList(list1);
        List<Integer> list= mygen.getList();
        list.forEach(System.out::println);


    }
    
}
