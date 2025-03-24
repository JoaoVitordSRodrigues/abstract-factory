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

// Implementação concreta da fábrica para MacOS
// Garante que os produtos criados pertencem à família MacOS
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton(); // Retorna um botão específico do MacOS
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox(); // Retorna um checkbox específico do MacOS
    }
}
