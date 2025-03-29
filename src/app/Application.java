/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import aula.pkg21.pkg03.engines.Engine;
import aula.pkg21.pkg03.factories.CarFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Application {
    private Engine engine;

    public Application(CarFactory factory) {
        engine = factory.createEngine();
    }

    public void accelerate() {
        engine.accelerate();
    }
}
