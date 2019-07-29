package javastudy;

import java.util.Iterator;
import java.util.TreeSet;

/*泛型的简单使用
 * */
public class GenericsDemo {

    public static void main(String[] args) {
        //TreeSet在添加元素的时候排序，元素必须能够被比较/或传给TreeSet一个比较器
        TreeSet<Unicorn> t = new TreeSet<Unicorn>();
        t.add(new Unicorn(2,"huahua"));
        t.add(new Unicorn(1,"tete"));
        t.add(new Unicorn(1,"meme"));
        //遍历集合
        Iterator<Unicorn> it = t.iterator();
        while(it.hasNext()){
            Unicorn u = it.next();
            System.out.println(u.getAge() + " " + u.getName());
        }
    }
}

class Unicorn implements Comparable<Unicorn>{
    private int age;
    private String name;
    
    public Unicorn(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Unicorn u) {
        int temp = this.age - u.age;
        return temp == 0 ? this.name.compareTo(u.name):temp;
    }
}