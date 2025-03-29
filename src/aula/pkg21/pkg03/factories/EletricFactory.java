/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.engines.EletricEngine;
import aula.pkg21.pkg03.engines.Engine;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe EletricFactory é uma fábrica concreta que implementa a interface GUIFactory.
// Sua função é criar elementos da interface gráfica específicos para o sistema MacOS.
public class EletricFactory implements CarFactory {
    // Método para criar um botão do tipo MacOS.
    @Override
    public Engine createEngine() {
        return new EletricEngine();
    }
    // Método para criar um checkbox do tipo MasOS.
    /*@Override;
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }*/
    
}

