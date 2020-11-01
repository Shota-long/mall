package com.dev.common.javademo;

import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lls
 * @version 1.0
 * @date 2020/10/28 23:51
 */
public class Test1 {
    @Test
    public void test(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("101","aaa",15));
        list.add(new Employee("102","aaa",13));
        list.add(new Employee("103","aaa",19));
        list.add(new Employee("104","aaa",12));
        list.add(new Employee("105","aaa",21));

        Collections.sort(list,(e1,e2)->{
            if (e1.getAge()==e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee e:list
             ) {
            System.out.println(e);
        }

    }

    @Data
    class Employee{
        private String sno;
        private String name;
        private int age;

        public Employee(String sno, String name, int age) {
            this.sno = sno;
            this.name = name;
            this.age = age;
        }

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
