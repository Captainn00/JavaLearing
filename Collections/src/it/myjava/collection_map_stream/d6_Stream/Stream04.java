package it.myjava.collection_map_stream.d6_Stream;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Stream流的终结方法
* 终结方法是指调用完成后，不会返回新的Stream了，会返回一个结果或者一个boolean值
* */

/*
* 收集Stream流
* 定义: 将Stream流中的数据，收集到一个新的集合或数组中
* */
public class Stream04 {
    public static void main(String[] args) {
        List<Teacher> list=new ArrayList<>();
        Teacher t1=new Teacher("小王",22,10000);
        Teacher t2=new Teacher("小李",19,8000);
        Teacher t3=new Teacher("小张",21,7000);
        Teacher t4=new Teacher("小何",20,9000);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        //常用终结方法：1.forEach() 2.count() 3.max() 4.min() 5.anyMatch() 6.allMatch() 7.noneMatch() 8.findAny() 9.findFirst

        //forEach()
        list.stream().filter(s -> s.getSalary()>=8000).forEach(System.out::println);

        //count()
        long count = list.stream().filter(s -> s.getSalary() >= 8000).count();
        System.out.println(count);

        //max()
        Optional<Teacher> max = list.stream().max((o1, o2)->Double.compare(t1.getSalary(),t2.getSalary()));

        System.out.println(max.get());

        System.out.println("---------------------");
        /*
        * 收集stream流
        * Stream提供的（终结方法）
        * R collect(Collector collector)  收集到指定的集合
        * Object[] toArray()   收集到数组
        *
        * Collectors 工具类提供了具体的收集方式
        * Collectors.toList()   收集到List集合
        * Collectors.toSet()   收集到Set集合
        * Collectors.toMap(key,value)   收集到Map集合
        * */

        //注意：流只能收集一次

        /*//收集到List集合
        List<Teacher> list2 = list.stream().filter(s -> s.getSalary() >= 8000).collect(Collectors.toList());
*/
        /*//收集到数组
        Object[] array = list.stream().filter(s -> s.getSalary() >= 8000).toArray();
        System.out.println(Arrays.toString(array));*/

        //收集到Map集合 键：名字 值：薪水
        Stream<Teacher> sorted = list.stream();
        Map<String, Integer> map = sorted.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));


    }
}

/*@Data  //作用：自动生成getter、setter、toString、equals、hashCode方法
@NoArgsConstructor //作用：自动生成无参构造
@AllArgsConstructor //作用：自动生成全参构造*/
class Teacher implements Comparable<Teacher>{
    private String name;
    private Integer age;
    private Integer Salary;

    public Teacher(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        Salary = salary;
    }

    public Teacher() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.age-o.age;
    }

}
