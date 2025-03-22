package factories;

import buttons.Button;
import checkbox.Checkbox;

/**
 * A interface GUIFactory representa a **fábrica abstrata** no contexto do padrão Abstract Factory.
 *
 * - Declara os métodos para a criação dos objetos dos produtos
 *
 */

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
