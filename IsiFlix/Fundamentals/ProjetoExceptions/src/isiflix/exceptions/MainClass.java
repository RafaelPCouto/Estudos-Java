package isiflix.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(1);
        p.setDescricao("null");

        System.out.println(p);
    }
}
