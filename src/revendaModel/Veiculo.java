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
public abstract class Veiculo {

    protected Veiculo(JSONObject o, Modelo modelo, Marca marca) {
        tipo = Integer.parseInt(o.get("tipo").toString());
        preco = Float.parseFloat(o.get("preco").toString());
        ano = Integer.parseInt(o.get("ano").toString());
        disponivel = Boolean.parseBoolean(o.get("disponivel").toString());
        codigo = Integer.parseInt(o.get("codigo").toString());
        preco = Float.parseFloat(o.get("preco").toString());
        this.modelo =  modelo;
        this.marca = marca;         
    }

    protected Veiculo() {
    }

    public JSONObject toJsonObject() {
        JSONObject obj = new JSONObject();
        obj.put("tipo", tipo);
        obj.put("preco", preco);
        obj.put("ano", ano);
        obj.put("disponivel", disponivel);
        obj.put("codigo", codigo);
        obj.put("codMarca", marca.getCodigo());
        obj.put("codModelo", modelo.getCodigo());
        return obj;
    }

    @Override
    public String toString() {
        return toJsonObject().toJSONString();
    }

    private Marca marca;
    private Modelo modelo;
    private int tipo;
    private float preco;
    private int ano;
    private boolean disponivel;
    private int codigo;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
