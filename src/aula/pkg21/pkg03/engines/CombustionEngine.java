/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg21.pkg03.engines;

/**
 *
 * @author FATEC ZONA LESTE
 */
// Definição de uma classe chamada CombustionEngine que implementa a interface Type
// Para usar uma interface, a classe deve adicionar "implements" seguido do nome da interface.
public class CombustionEngine implements Engine {
    // O @Override indica que estamos sobrescrevendo um método da interface Type
    @Override
    public void accelerate() {
        // Implementação do método paint(), conforme exigido pela interface Type
        System.out.println("You have accelerated a combustion car.");
    }
}
