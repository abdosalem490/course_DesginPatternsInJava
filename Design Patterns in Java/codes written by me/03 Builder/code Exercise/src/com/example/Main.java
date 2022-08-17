package com.example;




public class Main {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
    }
}

class Person
{
    public String name;
    public int age;
}

class CodeBuilder
{
    protected Person person = new Person();
    public CodeBuilder(String className)
    {
        // todo
        person.name = className;

    }

    public CodeBuilder addField(String name, String type)
    {
        // todo
        person.name = name;
        return this;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + person.name + '\'' +
                ", age='" + person.age + '\'' +
                '}';
    }
}
