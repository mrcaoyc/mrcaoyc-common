package com.github.mrcaoyc.common.bean;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class BeanCopyTest {

    @Test
    public void copy_parameter_is_null() {
        Person2 person2 = BeanCopy.copy(null, Person2.class);
        Assert.isNull(person2, "person2 should be null");
    }

    @Test
    public void copy() {
        Person person = new Person();
        person.setName("cyc");
        person.setAge(20);
        person.setGender("male");

        Person2 person2 = BeanCopy.copy(person, Person2.class);
        Assert.notNull(person2, "person2 should be null");
        Assert.state(Objects.equals(person.getName(), person2.getName()), "name should be equals");
        Assert.state(Objects.equals(person.getAge(), person2.getAge()), "age should be equals");
        Assert.isNull(person2.getAddress(), "address should be null");
    }


    @Test
    public void copy_ignore_properties() {
        Person person = new Person();
        person.setName("cyc");
        person.setAge(20);
        person.setGender("male");

        Person2 person2 = BeanCopy.copy(person, Person2.class, "name");
        Assert.notNull(person2, "person2 should be null");
        Assert.isNull(person2.getName(), "name should be null");
        Assert.state(Objects.equals(person.getAge(), person2.getAge()), "age should be equals");
        Assert.isNull(person2.getAddress(), "address should be null");
    }


    @Test
    public void copyList_parameter_is_null() {
        List<Person2> person2s = BeanCopy.copyList(null, Person2.class);
        Assert.notNull(person2s, "person2s should be not null");
        Assert.state(person2s.size() == 0, "size should be 0");
    }

    @Test
    public void copyList_size_is_zone() {
        List<Person> persons = new ArrayList<>(0);
        List<Person2> person2s = BeanCopy.copyList(null, Person2.class);
        Assert.notNull(person2s, "person2s should be not null");
        Assert.state(person2s.size() == 0, "size should be 0");
    }

    @Test
    public void copyList() {
        Person person1 = new Person();
        person1.setName("cyc");
        person1.setAge(20);
        person1.setGender("male");

        Person person2 = new Person();
        person2.setName("czr");
        person2.setAge(5);
        person2.setGender("male");

        List<Person> persons = Arrays.asList(person1, person2, null);

        List<Person2> person2s = BeanCopy.copyList(persons, Person2.class);

        Assert.notNull(person2s.get(0), "person2s first item should be not null");
        Assert.state(Objects.equals(person1.getName(),person2s.get(0).getName()), "name should be equals");
        Assert.state(Objects.equals(person1.getAge(), person2s.get(0).getAge()), "age should be equals");
        Assert.isNull( person2s.get(0).getAddress(), "address should be null");

        Assert.notNull(person2s.get(1), "person2s second item should be not null");
        Assert.state(Objects.equals(person2.getName(),person2s.get(1).getName()), "name should be equals");
        Assert.state(Objects.equals(person2.getAge(), person2s.get(1).getAge()), "age should be equals");
        Assert.isNull( person2s.get(0).getAddress(), "address should be null");

        Assert.isNull(person2s.get(2),"person2s third item should be  null");
    }


    @Test
    public void copyList_properties_ignore() {
        Person person1 = new Person();
        person1.setName("cyc");
        person1.setAge(20);
        person1.setGender("male");

        Person person2 = new Person();
        person2.setName("czr");
        person2.setAge(5);
        person2.setGender("male");

        List<Person> persons = Arrays.asList(person1, person2, null);

        List<Person2> person2s = BeanCopy.copyList(persons, Person2.class,"name");

        Assert.notNull(person2s.get(0), "person2s first item should be not null");
        Assert.isNull( person2s.get(0).getName(), "name should be null");
        Assert.state(Objects.equals(person1.getAge(), person2s.get(0).getAge()), "age should be equals");
        Assert.isNull( person2s.get(0).getAddress(), "address should be null");

        Assert.notNull(person2s.get(1), "person2s second item should be not null");
        Assert.isNull( person2s.get(0).getName(), "name should be null");
        Assert.state(Objects.equals(person2.getAge(), person2s.get(1).getAge()), "age should be equals");
        Assert.isNull( person2s.get(0).getAddress(), "address should be null");

        Assert.isNull(person2s.get(2),"person2s third item should be  null");
    }
}
