/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Definição de uma classe chamada MacOSButton que implementa a interface Button
// Para usar uma interface, a classe deve adicionar "implements" seguido do nome da interface.
public class MacOSButton implements Button {

    // O @Override indica que estamos sobrescrevendo um método da interface Button
    @Override
    public void paint() {
        // Implementação do método paint(), conforme exigido pela interface Button
        System.out.println("You have created MacOSButton.");
    }
}

