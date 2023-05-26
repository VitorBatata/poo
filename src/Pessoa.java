import java.util.Scanner;
public class Pessoa extends Sistema {
    public String nome;
    public String cpf;
    public String email;
    public String senha;
    public static Scanner ler = new Scanner(System.in);
   
    public Pessoa(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    public void getInfos() {
        System.out.println("=====================================================");
        System.out.println("Suas informações:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("=====================================================");
    }
    public static Pessoa ler() {
        System.out.println("=====================================================");
        System.out.println("= - Para realizar o cadastro, preencha as informacoes abaixo: - =");
        System.out.print("= Nome: ");
        String nome = ler.nextLine();
        System.out.print("= CPF: ");
        String cpf = ler.nextLine();
        System.out.print("= Email: ");
        String email = ler.nextLine();
        System.out.print("= Senha: ");
        String senha = ler.nextLine();
        System.out.println("=====================================================");
        System.out.println("Bem vindo(a), " + nome + "!");
        System.out.println("=====================================================");
        return new Pessoa(nome, cpf, email, senha);
    }
    public static void main(String[] args) {
        Boolean mostrarMenu = true;
        Pessoa pessoa;
        imprimirInicial();
        String escolha = ler.nextLine();
        while (mostrarMenu){
          if (escolha.equals("Login")) {
                System.out.println("=====================================================");
                System.out.println("= - Digite o email e senha - =");
                System.out.print("= Email: ");
                escolha = ler.nextLine();
                /* Lógica para verificação de email (Provavelmente só fazer um método)*/
                System.out.print("= Senha: ");
                escolha = ler.nextLine();
                /* Lógica para verificação de senha (Provavelmente só fazer um método)*/
                System.out.println("=====================================================");
            }
            if (escolha.equals("Cadastro")) {
                pessoa = Pessoa.ler();
                imprimirPrincipal();
                escolha = ler.nextLine();                
                switch (escolha) {
                    case "1":
                        imprimirCategoria1();
                        break;
                    case "2":
                        imprimirCategoria2();
                        break;
                    case "3":
                        imprimirCategoria3();
                        break;
                    case "Conta":
                        pessoa.getInfos();
                        break;
                    case "MeuCarrinho":
                        /* Metodo para exibir o carrinho */
                        break;
                    case "Sair":
                        /* Metódo para  */
                        break;
                }
            }  
    }
}       
}
