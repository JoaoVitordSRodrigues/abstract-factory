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
// Interface do padrão Abstract Factory, que define métodos para criar componentes de interface gráfica
// (como Button e Checkbox). O padrão Abstract Factory permite criar famílias de objetos relacionados sem
// especificar suas classes concretas. 
public interface GUIFactory {

    // Método para criar um botão
    Button createButton();

    // Método para criar uma caixa de seleção
    Checkbox createCheckbox();
}
