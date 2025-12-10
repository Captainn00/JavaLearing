package it.myjava.collection_map_stream.d2_collections;

import java.util.*;

/**
 * collections类
 */

public class collectionsText1 {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c,T...elements):为集合批量添加元素
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"小王","小李");
        System.out.println(names);
        //2.public static void shuffle(List<? > list):打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T> list):对集合中的元素进行升序排序
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students=new ArrayList<>();
        students.add(new Student("1","小王",12));
        students.add(new Student("2","小李",11));
        Collections.sort(students);
        System.out.println(students);
        //1.public static <T> void sort(List<T> list,Comparator<? super T> c):对List集合中的元素，按照比较器对象指定的规则进行排序
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(students);
    }
}


















