package checkbox;

/**
 * MacOSCheckbox é uma implementação concreta da interface Checkbox.
 *
 * - Representa um **produto concreto** para o ambiente MacOS dentro do padrão Abstract Factory.
 * - Implementa o método `paint()` de forma específica, exibindo a mensagem "MacOS Checkbox",
 *   o que simboliza a renderização do checkbox com a aparência do MacOS.
 * - Esta classe é instanciada pela fábrica concreta MacOSFactory responsável
 *   por criar todos os produtos (widgets) compatíveis com o estilo MacOS.
 */

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS Checkbox");
    }
}
