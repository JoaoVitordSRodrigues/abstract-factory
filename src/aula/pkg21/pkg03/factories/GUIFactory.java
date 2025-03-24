/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.buttons.Button;
import aula.pkg21.pkg03.buttons.checkboxes.Checkbox;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Interface abstrata para a fábrica GUI
// Define um conjunto de métodos para a criação de produtos relacionados
public interface GUIFactory {
    Button createButton();   // Método para criar um botão
    Checkbox createCheckbox(); // Método para criar um checkbox
}
