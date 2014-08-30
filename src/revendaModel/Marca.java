/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaModel;

import org.json.simple.JSONObject;

/**
 *
 * @author Aluno faculdade
 */
public class Marca {

    public Marca(JSONObject o) {
        nome = o.get("nome").toString();
        codigo =  Integer.parseInt(o.get("codigo").toString());
    }
    
    public Marca() {
    }

    private int codigo;
    private String nome;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public JSONObject toJsonObject() {
        return null;
    }
}
