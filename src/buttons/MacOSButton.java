package buttons;

/**
 * MacOSButton é uma implementação concreta da interface Button.
 *
 * - Representa um **produto concreto** para o ambiente MacOS dentro do padrão Abstract Factory.
 * - Implementa o método `paint()` de forma específica, exibindo a mensagem "MacOS Button",
 *   o que simboliza a renderização do botão com a aparência do MacOS.
 * - Esta classe é instanciada pela fábrica concreta MacOSFactory responsável
 *   por criar todos os produtos (widgets) compatíveis com o estilo MacOS.
 */

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacOS Button");
    }
}
