/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revendaDAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import revendaModel.Marca;
import revendaModel.Modelo;

/**
 *
 * @author Faculdade
 */
public class ModeloDAO extends JsonDAO{

    public ModeloDAO() {
        super("modelos.txt");
    }
    
    public void Salvar(Modelo modelo){
          try {
            JSONArray array = getArray();
            array.add(modelo.toJsonObject());

            byte[] bytes = array.toJSONString().getBytes();
            Files.write(arquivo, bytes, StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException ex) {
            //Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Modelo> retornarTodos() throws IOException {
        ArrayList<Modelo> modelos = new ArrayList<>();
                
        JSONArray array = this.getArray();
        
        for (Object object : array) {
            JSONObject o = (JSONObject)object;
            modelos.add(new Modelo(o));
        }       
        
        return modelos;
    }

    public Modelo retornarPorNome(String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
