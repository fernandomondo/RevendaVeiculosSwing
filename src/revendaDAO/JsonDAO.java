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
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**
 *
 * @author fernando
 */
public abstract class JsonDAO {
    
  protected Path arquivo;
  
    public JsonDAO(String nomeArquivo) {
        this.arquivo = Paths.get(System.getProperty("user.dir"), nomeArquivo);
    }
    
    protected JSONArray getArray() throws IOException {

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
    
}
