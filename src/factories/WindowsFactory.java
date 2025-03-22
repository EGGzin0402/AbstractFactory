package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

/**
 * WindowsFactory é uma implementação concreta da interface GUIFactory.
 *
 * - Representa uma **fábrica concreta** para o ambiente Windows dentro do padrão Abstract Factory.
 * - Implementa os métodos para criação dos objetos dos produtos concretos do ambiente Windows
 */

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
