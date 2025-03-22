/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.buttons.Button;
import aula.pkg21.pkg03.buttons.MacOSButton;
import aula.pkg21.pkg03.buttons.checkboxes.Checkbox;
import aula.pkg21.pkg03.buttons.checkboxes.MacOSCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe MacOSFactory é uma fábrica concreta que implementa a interface GUIFactory.
// Sua função é criar elementos da interface gráfica específicos para o sistema MacOS.
public class MacOSFactory implements GUIFactory {
    // Método para criar um botão do tipo MacOS.
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    // Método para criar um checkbox do tipo MasOS.
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

