/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaDAO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import revendaGUI.CadastroVeiculo;
import revendaModel.Veiculo;

/**
 *
 * @author Faculdade
 */
public class VeiculoDAO {//fui

    private Path arquivo = Paths.get(System.getProperty("user.dir"), "veiculos.txt");

    private JSONArray getArray() throws IOException {

        if (!Files.exists(arquivo)) {
            return null;
        }

        String texto = "";
        List<String> linhas = Files.readAllLines(arquivo, Charset.defaultCharset());
        for (String item : linhas) {
            texto += item;
        }

        return (JSONArray) JSONValue.parse(texto);
    }

    public void salvar(Veiculo veiculo) {
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

}
