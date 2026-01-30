package com.example.meu_primeiro_springboot.model;
//esse pacote model é onde ficará as entidades do banco de dados.
//onde o spring data jpa vai se encontrar para criar as tabelas e isso vai ocorrer nessa classe.
//estamos usando anotações do JPA para mapear a classe produto com uma tabela relacional no nosso banco de dados
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//entity vai indicar que essa classe é uma entidade JPA
@Table(name = "produtos")
//table indica e define o nome da tabela, que vai ser chamada produtos. 
public class Produto {
    
    @Id
    //indica que será um ID.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //o generatedValues indica que será e vai gerar uma chave primaria automaticamente.
    //procurar melhor sobre a linha acima, aprofundar estudos.
    private Long id;

    private String nome;
    private Double preco;

    public Produto() {}

    public Produto (String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
