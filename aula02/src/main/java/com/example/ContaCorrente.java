package com.example;

public class ContaCorrente {
    
    private String nome; 

    private Integer balanco;

    public void deposito(Integer valor){

        balanco = balanco + valor;

    }


    public ContaCorrente(String nome, Integer balanco) {
        this.nome = nome;
        this.balanco = balanco;
    }




    public boolean saque(Integer valor){

        

        if(valor <= balanco){

            balanco = balanco - valor;

            return true;
        }else{

            System.out.println("Não tem Dinheiro pobre");

            return false;

        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getBalanco() {
        return balanco;
    }

    public void setBalanco(Integer balanco) {
        this.balanco = balanco;
    }


    

}
