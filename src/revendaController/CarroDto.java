/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revendaController;

/**
 *
 * @author Faculdade
 */
public class CarroDto extends VeiculoDto{
    private final int numPortas;
    private final String opcionais;

    public CarroDto(int codigo, String nomeMarca, String nomeModelo, int ano, float preco, String situacao, int numPortas, String opcionais) {
        super(codigo, nomeMarca, nomeModelo, ano, preco, situacao);
        this.numPortas = numPortas;
        this.opcionais = opcionais;
    }
    public int getNumPortas() {
        return numPortas;
    }

    public String getOpcionais() {
        return opcionais;
    }
}
