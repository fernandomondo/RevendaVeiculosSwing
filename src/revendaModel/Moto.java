/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaModel;

import org.json.simple.JSONObject;

public class Moto extends Veiculo {

    public Moto(JSONObject o) {
        super(o);
    }

    public Moto() {
    }

    @Override
    public JSONObject toJsonObject() {
        JSONObject jSONObject = super.toJsonObject();
        jSONObject.put("cilindradas", cilindradas);
        jSONObject.put("estilo", estilo);
        return jSONObject;
    }

    private int cilindradas;
    private String estilo;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

}
