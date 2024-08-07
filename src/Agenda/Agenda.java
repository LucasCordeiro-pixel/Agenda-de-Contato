package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List <Contato> contatos;

    public Agenda (){
        contatos = new ArrayList<>();
    }
    public void adicionarContato (Contato contato){
        contatos.add(contato);
    }
    public void apagarContato (String nome){
    for (Contato contato: contatos){
        if (contato.getNome() == nome){
            contatos.remove(contato);
        } else {
            System.out.println("Contato não encontrado!");
        }
    }
    }
    public void procurarContato (){

    }
    public void listaDeContatos (){
        for (int i; i<= contatos.size)
    }
}
