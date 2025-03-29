/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg21.pkg03;

import app.Application;
import aula.pkg21.pkg03.factories.EletricFactory;
import aula.pkg21.pkg03.factories.CombustionFactory;
import aula.pkg21.pkg03.factories.CarFactory;
import java.util.Random;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aula2103 {

    /**
     * @param args the command line arguments
     */
    private static Application configureApplication() {
        String[] types = {"Eletric", "Combustion"};
        Random random = new Random();
        
        // Escolhe um índice aleatório (0 ou 1)
        String chosenType = types[random.nextInt(types.length)];
        
        System.out.println("Chosen type: " + chosenType);
        Application app;
        CarFactory factory;
        // Verifica o tipo e executa ações diferentes
        if (chosenType.equals("Eletric")) {
            factory = new EletricFactory();
            
        } else {
            factory = new CombustionFactory();
        }
        
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.accelerate();
        // TODO code application logic here
    }
    
}
