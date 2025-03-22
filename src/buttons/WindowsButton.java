package buttons;

/**
 * WindowsButton é uma implementação concreta da interface Button.
 *
 * - Representa um **produto concreto** para o ambiente Windows, conforme o padrão Abstract Factory.
 * - Implementa o método `paint()` de forma específica, exibindo a mensagem "Windows Button",
 *   o que simboliza a renderização do botão com a aparência do Windows.
 * - Esta classe é instanciada por uma fábrica concreta WindowsFactory
 *   que cria uma família de produtos compatíveis com o estilo Windows.
 */

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
