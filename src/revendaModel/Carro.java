/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revendaModel;


public class Carro extends Veiculo {
    
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
    public String toString(){
        return "Marca: " + getMarca().getNome() + ", Modelo: " + getModelo().getNome() + ", Ano: " + getAno() +
        ", Número de portas: " + getNumPortas() + ", Preço: " + getPreco();
    }
}
