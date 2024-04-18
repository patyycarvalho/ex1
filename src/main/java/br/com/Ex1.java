package br.com;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Ex1{

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("meuarquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Olá mundo!");

            bufferedWriter.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            System.out.println();
        }
    }
}