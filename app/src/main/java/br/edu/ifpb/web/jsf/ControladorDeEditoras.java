package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Editora;
import br.edu.ifpb.domain.Editoras;
import br.edu.ifpb.infra.EditorasEmJDBC;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControladorDeEditoras {

    private String localDeOrigem;
    private String nome;

    private Editoras editoras = new EditorasEmJDBC();
    public String salvar(){
        Editora editora = new Editora(localDeOrigem, nome);
        editoras.nova(editora);
        return null;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
