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
public class MotoDto extends VeiculoDto{
    private final String estilo;
    private final int cilindradas;

   
    public MotoDto(int codigo, String nomeMarca, String nomeModelo, int ano, float preco, String situacao, String estilo, int cilindradas) {
        super(codigo, nomeMarca, nomeModelo, ano, preco, situacao);
        this.estilo = estilo;
        this.cilindradas = cilindradas;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    
}
