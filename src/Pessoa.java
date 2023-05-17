import java.util.Scanner;
import java.util.ArrayList;
public class Pessoa extends Sistema {
    public String nome;
    public String cpf;
    public String email;
    public String senha;
    public ArrayList<Produto> arrCarrinho;
    public void getInfos() {
        System.out.println("Suas informações:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("=====================================================");
    }
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        imprimirMenu("Inicial");
		String escolha = ler.nextLine();
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
            Pessoa pessoa1 = new Pessoa();
            System.out.println("=====================================================");
            System.out.println("= - Para realizar o cadastro, preencha as informacoes abaixo: - =");
            System.out.print("= Nome: ");
            pessoa1.nome = ler.nextLine();
            System.out.print("= CPF: ");
            pessoa1.cpf = ler.nextLine();
            System.out.print("= Email: ");
            pessoa1.email = ler.nextLine();
            System.out.print("= Senha: ");
            pessoa1.senha = ler.nextLine();
            System.out.println("=====================================================");
            System.out.println("Bem vindo(a), " + pessoa1.nome + " !");
            System.out.println("=====================================================");
            pessoa1.getInfos();
        }
        imprimirMenu("Principal");
        escolha = ler.nextLine();
        switch (escolha) {
            case "1":
                imprimirMenu("Categoria1");
            break;
            
            case "2":
                imprimirMenu("Categoria2");
            break;
            
            case "3":
                imprimirMenu("Categoria3");
            break;

            case "Conta":
                imprimirMenu("Categoria3");
            break;

            case "MeuCarrinho":
                imprimirMenu("Categoria3");
            break;

            case "Sair":
                imprimirMenu("Sair");
            break;
            }
    }  
}
