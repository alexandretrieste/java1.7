/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.alexandretrieste_atividade7;

/**
 *
 * @author xande
 */
import java.util.Scanner;

public class Leitura {
    private Scanner sc;

    public Leitura() {
        sc = new Scanner(System.in);
    }

    public String entDadosString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public int entDadosInt(String mensagem) {
        System.out.print(mensagem);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }
}
