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
// Implementação concreta da fábrica para Windows
// Garante que os produtos criados pertencem à família Windows
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton(); // Retorna um botão específico do Windows
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna um checkbox específico do Windows
    }
}

