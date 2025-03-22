/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.buttons.Button;
import aula.pkg21.pkg03.buttons.WindowsButton;
import aula.pkg21.pkg03.buttons.checkboxes.Checkbox;
import aula.pkg21.pkg03.buttons.checkboxes.WindowsCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe WindowsFactory é uma fábrica concreta que implementa a interface GUIFactory.
// Sua função é criar elementos da interface gráfica específicos para o sistema Windows.
public class WindowsFactory implements GUIFactory {

    // Método para criar um botão do tipo Windows.
    @Override
    public Button createButton() {
        return new WindowsButton(); // Retorna uma instância de WindowsButton.
    }

    // Método para criar um checkbox do tipo Windows.
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna uma instância de WindowsCheckbox.
    }
}

