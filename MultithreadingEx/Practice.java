package MultithreadingEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// public class Practice extends Thread {
//     public static void main(String[] args) {
//         Practice thread = new Practice();
//         thread.start();
//         System.out.println("this code is running in outsude of thread");

//     }

//     public void run() {
//         System.out.println("This code is running in thread.");
//     }

// }

// -------------------------------------------------------------------------------------------------------------
// public class Practice implements Runnable {
//     public static void main(String[] args) {
//         Practice obj = new Practice();
//         Thread thread = new Thread(obj);
//         thread.start();
//         System.out.println("This code is running in outside of thread");
//     }

//     public void run() {
//         System.out.println("This code is rinning in inside in thread");
//     }
// }
// ----------------------------------------------------------------------------------------------------
public class Practice {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1 is waiting...");
                    lock.wait();
                    System.out.println("thrad 1 is resume");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                synchronized (lock) {
                    System.out.println("Thread 2 is notifying...");
                    lock.notify();
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        });
        thread1.start();
        thread2.start();

    }
}
// ---------------------------------------------------------------------------------------------------

// public class Practice{
// public static void main(String[] args) {
// ArrayList<Student> data = new ArrayList<>();
// data.add(new Student(1, "Ritika", 22));
// data.add(new Student(2, "Muslkan", 20));
// data.add(new Student(3, "Mayuri", 24));

// Iterator<Student> studData= data.iterator();
// while(studData.hasNext()){
// Student student = studData.next();
// System.out.println(student.id);
// System.out.println(student.name);
// System.out.println(student.age);
// }

// }
// }

// class Student{
// int id;
// String name;
// int age;

// public Student(int i, String n, int a){
// this.id=i;
// this.name=n;
// this.age=a;
// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class Practice {
// public static void main(String[] args) {
// try {
// int[] arr = { 1, 2, 3 };
// System.out.println(arr[2]);
// System.out.println("try block is runnning");
// } catch (Exception e) {
// System.out.println("Catch block is runnning");
// } finally {
// System.out.println("Try-catch is finished");
// }
// }
// }

// -----------------------------------------------------------------------------------------------------
// Overloading ex by changing the number of argument
// public class Practice {
// public int add(int a, int b) {
// return a + b;
// }

// public int add(int a, int b, int c) {
// return a + b + c;
// }

// public static void main(String[] args) {
// Practice practice = new Practice();
// System.out.println(practice.add(20, 30));
// System.out.println(practice.add(10, 30, 50));
// }
// }

// -----------------------------------------------------------------------------------------------------
// Overloading ex by changing the datatype of arguments
// public class Practice {
// public int add(int a, int b) {
// return a + b;
// }

// public double add(double a, double b) {
// return a + b;
// }

// public static void main(String[] args) {
// Practice practice = new Practice();
// System.out.println(practice.add(20, 30));
// System.out.println(practice.add(12.6, 10.2));
// }
// }
// ---------------------------------------------------------------------------------------------------

// Overrriding example

// class Office {
// public void employee() {
// System.out.println("This is a employee");
// }
// }

// public class Practice extends Office {
// public void employee() {
// super.employee();
// System.out.println("This is the employee of child class");
// }

// public static void main(String[] args) {
// Office practice = new Practice();
// practice.employee();
// // practice.employee();
// }

// }
// -----------------------------------------------------------------------------------
// Hashmap exmple
// public class Practice {
// public static void main(String[] args) {
// HashMap<Integer, String> data = new HashMap<>();
// data.put(1, "Ritika");
// data.put(2, "Muskan");
// data.put(4, "Himanshu");
// System.out.println(data);

// // for (Integer key : data.keySet()) {
// // System.out.println("Key: " + key + " Values: " + data.get(key));

// // }
// for (String value : data.values()) {
// System.out.println("Values: " + value);
// }

// for (Integer key : data.keySet()) {
// System.out.println("Keys: " + key);
// }
// }
// }

// public class Practice {
// public static void main(String[] args) {
// HashSet<String> mapValue = new HashSet<>();
// mapValue.add("Ritika");
// mapValue.add("Muskan");
// mapValue.add("Mayuri");

// System.out.println(mapValue);
// for (String value : mapValue) {
// System.out.println(value);

// }

// }
// }
// -----------------------------------------------------------------------------------------

// LinkdList Exmplae
// public class Practice {
// public static void main(String[] args) {
// LinkedList<Integer> list = new LinkedList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// System.out.println(list);
// list.addFirst(0);
// list.addLast(4);
// System.out.println(list);
// for (Integer integer : list) {
// System.out.println(integer);
// }
// }
// }

// ------------------------------------------------------------------------------------------

// Inheritance
// class employee {
// int salary = 40000;
// }

// public class Practice extends employee {
// double bonous = 1000;

// public static void main(String[] args) {

// Practice obj = new Practice();
// System.out.println("the salary of an employee is: " + obj.salary + " and the
// bonous is: " + obj.bonous);
// }
// }
// -----------------------------------------------------------------------------------

// S9ingle inheritance example

// class Animal {
// void eat() {
// System.out.println("Every Animal is Eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("The dosg is barking");
// }

// public static void main(String[] args) {
// Dog dog = new Dog();
// dog.bark();
// dog.eat();
// }
// }

// Multilevel inheritance exm
// class Animal {
// void eat() {
// System.out.println("Every Animal is Eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("The dosg is barking");
// }
// }

// class BabyDog extends Dog {
// void weep() {
// System.out.println("The babydog is weeping");
// }

// }

// public class Practice {
// public static void main(String[] args) {
// BabyDog babyDog = new BabyDog();
// babyDog.bark();
// babyDog.weep();
// babyDog.eat();
// }
// }

// ------------------------------------------------------------------------------------------

// Hirairical Inheritance example
// class Animal {
// void eat() {
// System.out.println("Every Animal is Eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("The dosg is barking");
// }
// }

// class Cat extends Animal {
// void Meau() {
// System.out.println("The Cat is Meauing");
// }

// }

// public class Practice {
// public static void main(String[] args) {
// Cat cat = new Cat();
// cat.eat();
// cat.Meau();

// Dog dog = new Dog();
// dog.bark();
// dog.eat();

// }
// }

// =-------------------------------------------------------------------------------------------------
// Multiple inheritance exmple

// class School {
// void student() {
// System.out.println("This is an student og a school");
// }
// }

// class Coching {
// void student() {
// System.out.println("This is an student of a coching");
// }
// }

// class Practice extends School,Coching
// {

// public static void main(String[] args) {
// Practice main = new Practice();
// main.student();
// }
// }

// ------------------------------------------------------------------------------------------
// Inheritance HAS-A Relationship(Aggregation)

// class Employee {
// int id;
// String name;
// Address address;

// public Employee(int i, String n, Address address) {
// this.id = i;
// this.name = n;
// this.address = address;
// }

// void display() {
// System.out.println("Employee Id : " + id + " Employee name: " + name);
// System.out.println("Employee city: " + address.city + " Employee State: " +
// address.state
// + " Employee ZipCode: " + address.zipCode);
// }

// public static void main(String[] args) {
// Address address1 = new Address("Indore", "MP", "275767");
// Address address2 = new Address("Maheshwar", "MP", "451224");

// Employee employee1 = new Employee(1, "Ritika", address1);
// Employee employee2 = new Employee(2, "Sajal", address2);

// employee1.display();
// employee2.display();
// }
// }

// class Address {
// String city, state, zipCode;

// public Address(String city, String state, String zipCode) {
// this.city = city;
// this.state = state;
// this.zipCode = zipCode;
// }
// }
// -----------------------------------------------------------------------

// Encapsulation Example

// class Employee {
// private String name;

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return name;
// }

// }

// class Main {

// public static void main(String[] args) {
// Employee employee = new Employee();
// employee.setName("Ritika");
// System.out.println(employee.getName());
// }
// }

// --------------------------------------------------------------------------------------
// Thread start();

// class ThreadClass implements Runnable {
// public void run() {
// try {
// System.out.println(Thread.currentThread().getId() + " Is runnning");
// System.out.println(Thread.currentThread().getName());
// } catch (Exception e) {
// e.printStackTrace();
// // TODO: handle exception
// }
// }
// }

// class Main {
// public static void main(String[] args) {
// ThreadClass threadClass = new ThreadClass();
// Thread thread = new Thread(threadClass);
// int n = 8;
// for (int i = 0; i <= n; i++) {
// // thread.run();
// thread.run();
// }
// }
// }

// -------------------------------------------------------------------------------------
// Thread run()
// class ThreadClass implements Runnable {
// public synchronized void run() {
// try {
// System.out.println(Thread.currentThread().getId() + " Is runnning");
// System.out.println(Thread.currentThread().getName());
// } catch (Exception e) {
// e.printStackTrace();
// // TODO: handle exception
// }
// }
// }

// class Main {
// public static void main(String[] args) {
// ThreadClass threadClass = new ThreadClass();
// Thread thread = new Thread(threadClass);
// thread.start();
// thread.run();
// }
// }

// -------------------------------------------------------------------------------------
// Interface Example

// interface employee {
// void salary();
// }

// class Main implements employee {
// public void salary() {
// System.out.println("The salary of each employee is : 40000");
// }

// public static void main(String[] args) {
// Main main = new Main();
// main.salary();
// }
// }

// ------------------------------------------------------------------------------------
// Abstraction Example

// abstract class SendMassage {
// abstract void msg();

// void call();
// }

// class Sender extends SendMassage {
// public void msg() {
// System.out.println("this msg is send by sender");
// }

// public void call() {
// System.out.println("this is sender call");
// }

// }

// class Reciver extends SendMassage {
// public void msg() {
// System.out.println("this msg is receve by Recever");
// }

// public void call() {
// System.out.println("this is recever call");
// }
// }

// class AbstractEx {
// public static void main(String[] args) {
// SendMassage msg1 = new Sender();
// SendMassage msg2 = new Reciver();

// msg1.msg();
// msg1.call();
// msg2.msg();
// msg2.call();
// }
// }
// ------------------------------------------------------------------------------------------------

// class ObjectClassEx {
// public static void main(String[] args) {
// Object obj1 = new Object();
// Object obj2 = new Object();

// System.out.println("Object1 is equls to Object2: " + obj1.equals(obj2));

// System.out.println("obj1 hasCode: " + obj1.hashCode());
// System.out.println("obj2 hasCode: " + obj2.hashCode());

// System.out.println("obj1 : " + obj1.toString());
// System.out.println("obj2 : " + obj2.toString());
// }
// }
// ------------------------------------------------------------------------------------

// class Practice {
// Practice() {
// System.out.println("constructor is calling");
// }

// public static void main(String[] args) {
// Practice practice = new Practice();
// }
// }

// class Student4 {
// int id;
// String name;

// // creating a parameterized constructor
// Student4(int i, String n) {
// id = i;
// name = n;
// }

// // method to display the values
// void display() {
// System.out.println(id + " " + name);
// }

// public static void main(String args[]) {
// // creating objects and passing values
// Student4 s1 = new Student4(111, "Karan");
// Student4 s2 = new Student4(222, "Aryan");
// // calling method to display the values of object
// s1.display();
// s2.display();
// }
// }