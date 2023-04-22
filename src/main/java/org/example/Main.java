package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .name("Анна")
                .surname("Вольф")
                .address("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .name("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().age(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}