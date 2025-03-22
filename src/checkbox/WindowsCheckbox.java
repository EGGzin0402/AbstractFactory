package checkbox;

/**
 * WindowsCheckbox é uma implementação concreta da interface Checkbox.
 *
 * - Representa um **produto concreto** para o ambiente Windows, conforme o padrão Abstract Factory.
 * - Implementa o método `paint()` de forma específica, exibindo a mensagem "Windows Checkbox",
 *   o que simboliza a renderização do checkbox com a aparência do Windows.
 * - Esta classe é instanciada por uma fábrica concreta WindowsFactory
 *   que cria uma família de produtos compatíveis com o estilo Windows.
 */


public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
