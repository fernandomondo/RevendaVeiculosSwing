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
public class VeiculoDto {

    private final int codigo;
    private final String nomeMarca;
    private final String nomeModelo;
    private final int ano;
    private final float preco;
    private final String situacao;

    public VeiculoDto(int codigo, String nomeMarca, String nomeModelo, int ano, float preco, String situacao) {
        this.codigo = codigo;
        this.nomeMarca = nomeMarca;
        this.nomeModelo = nomeModelo;
        this.ano = ano;
        this.preco = preco;
        this.situacao = situacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public int getAno() {
        return ano;
    }

    public float getPreco() {
        return preco;
    }

    public String getSituacao() {
        return situacao;
    }

}
