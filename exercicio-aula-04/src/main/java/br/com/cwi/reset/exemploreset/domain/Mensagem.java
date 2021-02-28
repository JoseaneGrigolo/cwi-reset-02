package br.com.cwi.reset.exemploreset.domain;

public class Mensagem {

    private String Mensagem;
    private String autor;

    public Mensagem(String mensagem, String autor) {
        Mensagem = mensagem;
        this.autor = autor;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}
