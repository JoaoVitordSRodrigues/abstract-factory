/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.engines.CombustionEngine;
import aula.pkg21.pkg03.engines.Engine;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe CombustionFactory é uma fábrica concreta que implementa a interface CarFactory.
// Sua função é criar elementos da interface gráfica específicos para o sistema Windows.
public class CombustionFactory implements CarFactory {

    // Método para criar um botão do tipo Windows.
    @Override
    public Engine createEngine() {
        return new CombustionEngine(); // Retorna uma instância de CombustionEngine.
    }

    // Método para criar um checkbox do tipo Windows.
    /*@Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna uma instância de WindowsCheckbox.
    }*/

}

