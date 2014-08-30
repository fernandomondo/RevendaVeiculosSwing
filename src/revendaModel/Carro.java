/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaModel;

import org.json.simple.JSONObject;

public class Carro extends Veiculo {

    public Carro(JSONObject o, Marca marca, Modelo modelo) {
        super(o, modelo, marca);
        numPortas = Integer.parseInt(o.get("numPortas").toString());
        opcionais = o.get("opcionais").toString();                
    }

    public Carro() {

    }

    @Override
    public JSONObject toJsonObject() {
        JSONObject jSONObject = super.toJsonObject();
        jSONObject.put("numPortas", numPortas);
        jSONObject.put("opcionais", opcionais);
        return jSONObject;
    }

    private int numPortas;
    private String opcionais;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca().getNome() + ", Modelo: " + getModelo().getNome() + ", Ano: " + getAno()
                + ", Número de portas: " + getNumPortas() + ", Preço: " + getPreco();
    }
}
