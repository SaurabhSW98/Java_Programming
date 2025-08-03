package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Person other = (Person) obj;
            return id == other.getId() && Objects.equals(name, other.getName());
        }


    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

}

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {
        Person p1 = new Person("john", 190);
        Person p2 = new Person("stacy", 180);
        Person p3 = new Person("john", 190);
        HashMap<Person, String> map = new HashMap<>();
        map.put(p1, "engineer"); ///hashcode->index1
        map.put(p2, "actor");///hashcode -> index2
        map.put(p3, "manager");///hashcode -> index1 -> equals -> replace

        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(190,"Saurabh");
        map1.put(200,"George");
        map1.put(190,"oli");

        System.out.println(map1.size());

    }
}
