/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg21.pkg03;

import app.Application;
import aula.pkg21.pkg03.factories.GUIFactory;
import aula.pkg21.pkg03.factories.MacOSFactory;
import aula.pkg21.pkg03.factories.WindowsFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aula2103 {

    /**
     * @param args the command line arguments
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
        // TODO code application logic here
    }
    
}
