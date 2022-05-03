package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Editora;
import br.edu.ifpb.domain.Editoras;
import br.edu.ifpb.infra.EditorasEmJDBC;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ControladorDeEditoras {

//    private String localDeOrigem;
//    private String nome;
    private Editora editora = new Editora();

    private Editoras editoras = new EditorasEmJDBC();
    public String salvar(){
//        Editora editora = new Editora(localDeOrigem, nome);
//        if(editora.valida())
        editoras.nova(editora);
        return "listar";
    }

    public List<Editora> todasAsEditoras(){
        return this.editoras.todas();
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    //
//    public String getLocalDeOrigem() {
//        return localDeOrigem;
//    }
//
//    public void setLocalDeOrigem(String localDeOrigem) {
//        this.localDeOrigem = localDeOrigem;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getNome() {
//        return nome;
//    }
}
