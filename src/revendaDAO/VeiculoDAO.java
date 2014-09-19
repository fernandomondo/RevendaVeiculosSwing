/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaDAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import revendaController.VeiculoDto;
import revendaModel.Carro;
import revendaModel.Marca;
import revendaModel.Modelo;
import revendaModel.Moto;
import revendaModel.Veiculo;

/**
 *
 * @author Faculdade
 */
public class VeiculoDAO extends JsonDAO {

    private final ModeloDAO modeloDAO;
    private final MarcaDAO marcaDAO;
    private int codigo;

    public VeiculoDAO(ModeloDAO modeloDAO, MarcaDAO marcaDAO) {
        super("veiculos.txt");
        this.modeloDAO = modeloDAO;
        this.marcaDAO = marcaDAO;
        codigo = retornarUltimoCodigo() + 1;
    }

    public void salvar(Veiculo veiculo) {
        veiculo.setCodigo(codigo++);
        try {
            JSONArray array = getArray();
            array.add(veiculo.toJsonObject());

            byte[] bytes = array.toJSONString().getBytes();
            Files.write(arquivo, bytes, StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException ex) {
            //Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Veiculo> retornarTodos() throws IOException {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        JSONArray array = this.getArray();

        for (Object object : array) {
            JSONObject o = (JSONObject) object;

            Marca marca = marcaDAO.retornarPorCodigo(Integer.parseInt(o.get("codMarca").toString()));
            Modelo modelo = modeloDAO.retornarPorCodigo(Integer.parseInt(o.get("codModelo").toString()));

            if (o.get("tipo").toString().equals("1")) {
                veiculos.add(new Carro(o, marca, modelo));
            } else {
                veiculos.add(new Moto(o, marca, modelo));
            }
        }

        return veiculos;
    }

    public void excluir(int codigo) throws Exception {
        try {
            JSONArray array = getArray();

            boolean achou = false;
            for (Object object : array) {
                JSONObject o = (JSONObject) object;

                if (o.get("codigo").toString().equals(String.valueOf(codigo))) {
                    array.remove(o);
                    achou = true;
                    break;
                }
            }

            if (!achou) {
                throw new Exception("Veiculo não encontrado.");
            }

            byte[] bytes = array.toJSONString().getBytes();
            Files.write(arquivo, bytes, StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException ex) {
            //Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Veiculo retornarPorCodigo(int codigoVeiculo) {
        try {
            JSONArray array = this.getArray();

            for (Object object : array) {
                JSONObject o = (JSONObject) object;

                Marca marca = marcaDAO.retornarPorCodigo(Integer.parseInt(o.get("codMarca").toString()));
                Modelo modelo = modeloDAO.retornarPorCodigo(Integer.parseInt(o.get("codModelo").toString()));

                if (o.get("tipo").toString().equals("1")) {
                    return new Carro(o, marca, modelo);
                } else {
                    return new Moto(o, marca, modelo);
                }
            }
        } catch (IOException ex) {
            //Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return null;
    }

    private int retornarUltimoCodigo() {
        try {
            ArrayList<Veiculo> veiculos = retornarTodos();
            return veiculos.get(veiculos.size() - 1).getCodigo();
        } catch (IOException ex) {
            return 0;
        }
    }
}
