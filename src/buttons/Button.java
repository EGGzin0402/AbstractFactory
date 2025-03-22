package buttons;

/**
 * A interface Button representa o **produto abstrato** no contexto do padrão Abstract Factory.
 *
 * - Declara o método `paint()`, que define uma operação comum a todos os botões.
 * - Serve como contrato para as implementações concretas (ex.: MacOSButton, WindowsButton).
 * - Ao trabalhar com esta interface, os clientes permanecem independentes das classes concretas,
 *   permitindo que o estilo dos botões seja alterado simplesmente trocando a fábrica responsável por criá-los.
 */

public interface Button {
    void paint();
}
