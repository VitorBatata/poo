public class Sistema {
    public static void imprimirPrincipal () {
        System.out.println("== Qual categoria de Gift Cards deseja visualizar? ==");
        System.out.println("= 1 - Jogos                                         =");
        System.out.println("= 2 - Alimentacao                                   =");
        System.out.println("= 3 - Transporte                                    =");
        System.out.println("=====================================================");
        System.out.println("= Digite 'MeuCarrinho' para visualizar seu carrinho =");
        System.out.println("= Digite 'Sair' para encerrar sessao                =");
        System.out.println("= Digite 'Conta' para visualizar informacoes de conta    =");
        System.out.println("=====================================================");
        System.out.print("Sua opcao: ");
    }
    public static void imprimirCategoria1 () {
        System.out.println("=====================================================");
        System.out.println("- Categoria Jogos -");
        System.out.println("=====================================================");
        System.out.println("= Digite o numero do card para adicionar item ao carrinho");
        System.out.println("= 1 - League of Legends - Valor: R$ 50,00");
        System.out.println("= 2 - Valorant - Valor: R$ 20,00");
        System.out.println("= 3 - Overwatch - Valor: R$ 25,00");
        System.out.println("=====================================================");
        System.out.println("= Digite 'Voltar' para voltar ao menu principal");
        System.out.println("=====================================================");
        System.out.print("Sua opcao: ");
    }
    public static void imprimirCategoria2 () {
        System.out.println("=====================================================");
        System.out.println("- Categoria Alimentacao -");
        System.out.println("=====================================================");
        System.out.println("= Digite o numero do card para adicionar item ao carrinho");
        System.out.println("= 1 - iFood - Valor: R$ 50,00");
        System.out.println("= 2 - Uber Eats - Valor: R$ 50,00");
        System.out.println("=====================================================");
        System.out.println("= Digite 'Voltar' para voltar ao menu principal");
        System.out.print("Sua opcao: ");
    }
    public static void imprimirCategoria3 () {
        System.out.println("=====================================================");
        System.out.println("- Categoria Transporte -");
        System.out.println("=====================================================");
        System.out.println("= Digite o numero do card para adicionar item ao carrinho");
        System.out.println("= 1 - Uber - Valor: R$ 30,00");
        System.out.println("= 2 - 99Taxi - Valor: R$ 40,00");
        System.out.println("=====================================================");
        System.out.println("= Digite 'Voltar' para voltar ao menu principal");
        System.out.print("Sua opcao: ");
    }
    public static void imprimirInicial () {
        System.out.println("=====================================================");
        System.out.println("======== - Seja bem-vindo(a) ao J&V Cards! - ========");
        System.out.println("=====================================================");
        System.out.println("= - Deseja fazer login ou realizar o cadastro? (Login/Cadastro) - =");
        System.out.print("= Sua opcao: ");
    }
    public void imprimirSair () {
        System.out.println("=====================================================");
        System.out.println("= - Deseja sair? - =");
        System.out.print("= Sua opcao: ");
    }
}
