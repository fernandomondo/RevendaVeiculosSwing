/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaDAO;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import revendaModel.Marca;

/**
 *
 * @author Faculdade
 */
public class MarcaDAO extends JsonDAO {

    public MarcaDAO() {
        super("marcas.txt");
    }

    //ArrayList<Marcas> marcas = new ArrayList<>();
    public ArrayList<Marca> retornarTodas() throws IOException {

        ArrayList<Marca> marcas = new ArrayList<>();

        JSONArray array = this.getArray();

        for (Object object : array) {
            JSONObject o = (JSONObject) object;
            marcas.add(new Marca(o));
        }

        return marcas;
    }

    public Marca retornarPorNome(String marca) throws IOException {

        JSONArray array = this.getArray();

        for (Object object : array) {
            JSONObject o = (JSONObject) object;
            Marca m = new Marca(o);
            if (m.getNome().equals(marca)) {
                return m;
            }
        }
        return null;
    }

    Marca retornarPorCodigo(int codigo) throws IOException {
        JSONArray array = this.getArray();

        for (Object object : array) {
            JSONObject o = (JSONObject) object;
            Marca m = new Marca(o);
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

}
