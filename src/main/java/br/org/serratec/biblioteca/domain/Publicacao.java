package br.org.serratec.biblioteca.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Embeddable
public class Publicacao {

    @NotBlank(message = "Campo nao pode estar vazio")
    @Column(nullable = false, length = 30)
    @Size(min = 3, max = 30, message = "Tamanho deve estar entre {min} e {max} caracteres")
    private String autor;


    private LocalDate dataPublicacao;

    private String editora;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
