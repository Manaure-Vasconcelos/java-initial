package edu.manaure.javaInitial;

public class Operators {
    public static void main(String [] args) {
        // = != < <= > >= <> comparação
        // + - * / aritmetico
        // ! + - ++ -- unario
        // && || logico

        int number = 10;

        System.out.println(- 10); // torna negativo ou positivo mas nao altera.
    }

    public static void ternario(){
        int a, b;

        a = 5;
        b = 6;

        boolean result = a == b ? true : false;
        System.out.println(result);
    }
}
