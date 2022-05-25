package com.company.logica.leitura_e_escrita_de_dados_em_arquivos;

/*

Mostre a lista de tarefas para o usuário

 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Exercicio02 {
    public static void main(String[] args) throws IOException {
        List<String> linhas = lerDoArquivo("C:\\Users\\Administrador\\Desktop\\arquivo.txt");;
        System.out.println("SUA LISTA DE TAREFAS DO DIA");
        for (int i = 0; i < linhas.size(); i++) {
            String tarefa = linhas.get(i);
            System.out.println(i + ": " + tarefa);
        }
        System.out.println("----------");
    }
    static List<String> lerDoArquivo(String arquivo) throws IOException {
        Path path = Paths.get(arquivo);
        return Files.readAllLines(path);
    }
}
