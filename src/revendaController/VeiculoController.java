/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaController;

import java.io.IOException;
import java.util.ArrayList;
import revendaDAO.MarcaDAO;
import revendaDAO.ModeloDAO;
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
    private MarcaDAO marcaDAO;
    private final ModeloDAO modeloDAO;

    public VeiculoController(VeiculoDAO veiculoDao, MarcaDAO marcaDAO, ModeloDAO modeloDAO) {
        this.veiculoDao = veiculoDao;
        this.marcaDAO = marcaDAO;
        this.modeloDAO = modeloDAO;
    }

    public void cadastrarCarro(int numPortas, String opcionais, String marca, String modelo, Float preco, int ano, Boolean disponivel) throws IOException {
        Carro c1 = new Carro();
        c1.setNumPortas(numPortas);
        c1.setOpcionais(opcionais);
        c1.setTipo(1);
        terminarDecadastrarVeiculo(c1, ano, marca, modelo, preco, disponivel);
    }

    public void cadastrarMoto(String estilo, int cilindradas, String marca, String modelo, Float preco, int ano, Boolean disponivel) throws IOException {
        Moto m1 = new Moto();
        m1.setCilindradas(cilindradas);
        m1.setEstilo(estilo);
        m1.setTipo(2);
        terminarDecadastrarVeiculo(m1, ano, marca, modelo, preco, disponivel);
    }

    private void terminarDecadastrarVeiculo(Veiculo veiculo, int ano, String marca, String modelo, Float preco, Boolean disponivel) throws IOException {

        Marca m = marcaDAO.retornarPorNome(marca);
        veiculo.setMarca(m);

        Modelo mo = modeloDAO.retornarPorNome(modelo);

        veiculo.setModelo(mo);
        veiculo.setPreco(preco);
        veiculo.setAno(ano);
        veiculo.setDisponivel(disponivel);

        veiculoDao.salvar(veiculo);
    }

    public ArrayList<String> retornarNomeDasMarcas() throws IOException {

        ArrayList<String> todasMarcas = new ArrayList<>();

        for (Marca marca : marcaDAO.retornarTodas()) {
            todasMarcas.add(marca.getNome());
        }
        return todasMarcas;
    }

    public ArrayList<String> retornarNomeDosModelos() throws IOException {

        ArrayList<String> todosModelos = new ArrayList<>();

        for (Modelo modelo : modeloDAO.retornarTodos()) {
            todosModelos.add(modelo.getNome());
        }
        return todosModelos;
    }

    public ArrayList<VeiculoDto> retornarDadosVeiculos() throws IOException {

        ArrayList<VeiculoDto> lista = new ArrayList<>();
        for (Veiculo veiculo : veiculoDao.retornarTodos()) {
            lista.add(new VeiculoDto(
                    veiculo.getCodigo(), veiculo.getMarca().getNome(),
                    veiculo.getModelo().getNome(), veiculo.getAno(), veiculo.getPreco(),
                    veiculo.isDisponivel() ? "Disponivel" : "Indisponível"
            ));
        }

        return lista;
    }

    public void excluirCarroPorCodigo(int codigo) throws Exception {
        this.veiculoDao.excluir(codigo);
    }

    public VeiculoDto retornarPorCodigo(int codigoVeiculo) {
        Veiculo veiculo = veiculoDao.retornarPorCodigo(codigoVeiculo);
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            return new CarroDto(
                    veiculo.getCodigo(), veiculo.getMarca().getNome(),
                    veiculo.getModelo().getNome(), veiculo.getAno(), veiculo.getPreco(),
                    veiculo.isDisponivel() ? "Disponivel" : "Indisponível", carro.getNumPortas(), carro.getOpcionais()
            );
        } else {
            Moto moto = (Moto) veiculo;
            return new MotoDto(
                    veiculo.getCodigo(), veiculo.getMarca().getNome(),
                    veiculo.getModelo().getNome(), veiculo.getAno(), veiculo.getPreco(),
                    veiculo.isDisponivel() ? "Disponivel" : "Indisponível", moto.getEstilo(), moto.getCilindradas());
        }
    }
}
