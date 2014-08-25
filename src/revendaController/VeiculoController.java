/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaController;

import java.util.ArrayList;
import revendaDAO.VeiculoDAO;
import revendaModel.Carro;
import revendaModel.Marca;
import revendaModel.Modelo;
import revendaModel.Moto;
import revendaModel.Veiculo;

/**
 *
 * @author fernando
 */
public class VeiculoController {

    private final VeiculoDAO veiculoDao;

    public VeiculoController(VeiculoDAO veiculoDao) {
        this.veiculoDao = veiculoDao;
    }

    public VeiculoController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param tipo
     * @param marca
     * @param modelo
     */
    public void cadastrarVeiculo(int tipo, int numPortas, String opcionais, int cilindradas, String estilo, String marca, String modelo, Float preco, int ano, Boolean disponivel) {
        Veiculo veiculo;

        if (tipo == 1) {
            Carro c1 = new Carro();
            veiculo = c1;
            c1.setNumPortas(numPortas);
            c1.setOpcionais(opcionais);
            veiculo.setTipo(tipo);
        } else {
            Moto m1 = new Moto();
            veiculo = m1;
            m1.setCilindradas(cilindradas);
            m1.setEstilo(estilo);
            veiculo.setTipo(tipo);
        }

        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setPreco(preco);
        veiculo.setAno(ano);
        veiculo.setDisponivel(disponivel);

        VeiculoDAO.salvar(veiculo);

    }
    
    public ArrayList<String> retornarMarcasPorNome(){
    
    ArrayList<String> todasMarcas = new ArrayList<>();
        for (Marca marca : marcas) {
            todasMarcas.add(marca.getNome());
            return todasMarcas;
        }
}
