package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

/**
 * MacOSFactory é uma implementação concreta da interface GUIFactory.
 *
 * - Representa uma **fábrica concreta** para o ambiente MacOS dentro do padrão Abstract Factory.
 * - Implementa os métodos para criação dos objetos dos produtos concretos do ambiente MacOS
 */

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
