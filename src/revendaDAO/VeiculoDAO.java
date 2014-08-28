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
import revendaModel.Veiculo;

/**
 *
 * @author Faculdade
 */
public class VeiculoDAO {//fui
    
    public static JSONArray array = new JSONArray();
    public static Path arquivo = Paths.get(System.getProperty("user.dir"), "veiculos.txt");
    
    public static void carregarArray() throws IOException {

        if(!Files.exists(arquivo)) return;
        
        String texto = "";
        List<String> linhas = Files.readAllLines(arquivo, Charset.defaultCharset());
        for (String item : linhas) {
            texto += item;
        }

        array = (JSONArray) JSONValue.parse(texto);
    }

    public static void salvar(Veiculo veiculo) {
       JSONObject obj = new JSONObject();
        obj.put("Nome", nome);
        obj.put("Data", dataNasc);
        obj.put("Sexo", sexo);
        obj.put("Funcao", funcao);
        obj.put("VT", vt);

        try {
            RevisaoSwing.carregarArray();
            RevisaoSwing.array.add(obj);

            byte[] bytes = RevisaoSwing.array.toJSONString().getBytes();
            Files.write(RevisaoSwing.arquivo, bytes, StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException ex) {
            Logger.getLogger(FormCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
    }
    
}
