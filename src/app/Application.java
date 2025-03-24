/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import aula.pkg21.pkg03.buttons.Button;
import aula.pkg21.pkg03.buttons.checkboxes.Checkbox;
import aula.pkg21.pkg03.factories.GUIFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
// Cliente que utiliza a fábrica abstrata para criar componentes da GUI
// O cliente não precisa saber quais implementações concretas estão sendo usadas
public class Application {
    private Button button;
    private Checkbox checkbox;

    // O cliente recebe uma fábrica abstrata e instancia os produtos a partir dela
    public Application(GUIFactory factory) {
        button = factory.createButton(); // Cria um botão adequado à fábrica passada
        checkbox = factory.createCheckbox(); // Cria um checkbox adequado à fábrica passada
    }

    // Método que aciona os métodos dos produtos criados
    public void paint() {
        button.paint(); // Exibe a saída específica do botão
        checkbox.paint(); // Exibe a saída específica do checkbox
    }
}
