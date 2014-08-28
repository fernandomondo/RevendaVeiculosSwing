/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revendaveiculosswing;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.simple.JSONArray;
import revendaController.VeiculoController;
import revendaDAO.MarcaDAO;
import revendaDAO.ModeloDAO;
import revendaDAO.VeiculoDAO;

/**
 *
 * @author Faculdade
 */
public class RevendaVeiculosSwing {
    
    
    public static void main(String[] args) {
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        MarcaDAO marcaDAO = new MarcaDAO();
        ModeloDAO modeloDAO = new ModeloDAO();
        VeiculoController veiculoController = new VeiculoController(veiculoDAO, marcaDAO, modeloDAO);
        revendaGUI.Principal principal = new revendaGUI.Principal(veiculoController);
        principal.setVisible(true);
    }
    
}
