/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.factories;

import aula.pkg21.pkg03.engines.Engine;

/**
 *
 * @author FATEC ZONA LESTE
 */
// Interface do padrão Abstract Factory, que define métodos para criar componentes de interface gráfica
// (como Type e Checkbox). O padrão Abstract Factory permite criar famílias de objetos relacionados sem
// especificar suas classes concretas. 
public interface CarFactory {

    // Método para criar um botão
    Engine createEngine();

    // Método para criar uma caixa de seleção
    //Checkbox createCheckbox();
}
