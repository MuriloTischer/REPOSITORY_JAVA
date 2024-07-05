package dev.murilotischer.calculadora;


/**
 * @author MURILO TISCHER
 */
public class AppCalculadora {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.showMenu();
            int opcao = menu.perguntaOpcaoDoUsuario();
            menu.verificaSeOpcaoIsValida(opcao);
            Double userResult = menu.identificaAndExecutaOpcaoDoUsuario(opcao);

            if (menu.verificaFimDaExecucao(userResult)) {
                return;
            }
            menu.showResultado(userResult);
        }

    }
}
