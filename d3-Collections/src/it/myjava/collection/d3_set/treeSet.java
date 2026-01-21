package it.myjava.collection.d3_set;


import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        //基于红黑树实现排序,不重复，无索引，可排序（默认从小到大）
        //对于Integer,Double,默认按照数值本身的大小进行升序排序
        //对于字符串类型，默认按照首字符的编号升序排序
        /**
         * 对于自定义类型对象，默认无法直接排序，自定义排序规则
         * 方法一：实现Comparable接口，重写里面的compareTo方法来指定比较规则
         * 方法二：通过TreeSet集合有参数构造器，可以设置Comparator对象（比较器对象，用于指定比较规则。）
         */


        Set<Integer> set1=new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(6);
        System.out.println(set1);

        /**
         * 就近选择自己自带的比较器对象进行排序
         *Set<Student> students=new TreeSet<>(new Comparator<Student>() {
         *             @Override
         *             public int compare(Student o1, Student o2) {
         *                 return o1.getAge()-o2.getAge();
         *             }
         *         });
         */

        Set<Student> s=new TreeSet<>();
        s .add(new Student("1","鱼",1));
        s .add(new Student("2","花生",2));
        s .add(new Student("3","玉米",2));
        System.out.println(s);
    }
}

