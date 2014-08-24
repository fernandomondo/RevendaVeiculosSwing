/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revendaModel;


public class Moto extends Veiculo {
    
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
    
    @Override
    public String toString(){
        return "Marca: " + getMarca().getNome()+ ", Modelo: " + getModelo().getNome() + 
                ", Ano: " + getAno() + ", Cilindradas: " + getCilindradas() +
                ", Preço: " + getPreco();
    }
}
