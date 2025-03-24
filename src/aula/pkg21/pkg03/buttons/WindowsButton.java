/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Implementação concreta de Button para MacOS
// Representa um produto específico criado pela fábrica concreta MacOSFactory
public class WindowsButton implements Button {

    @Override
    public void paint() {

        System.out.println("You have created WindowsButton.");
    }
}
