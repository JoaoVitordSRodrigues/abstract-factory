/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.buttons.checkboxes;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Definição da classe MacOSCheckbox que implementa a interface Checkbox
// Assim como explicado no slide, a classe usa "implements" para indicar que segue o contrato da interface.
public class MacOSCheckbox implements Checkbox {

    // O @Override indica que estamos sobrescrevendo um método da interface Checkbox
    @Override
    public void paint() {
        // Implementação do método paint(), exigido pela interface Checkbox
        System.out.println("You have created MacOSCheckbox.");
    }
}
