import java.util.Scanner;

public class App {
    public static void main(String[] args) {
               ListaDeTarefa listaDeTarefa = new ListaDeTarefa();

        Scanner scanner = new Scanner(System.in);
        int escolha;


        do {
            System.out.println("Opções do menu:");
            System.out.println("1. Adicionar uma nova tarefa.");
            System.out.println("2. Remover uma tarefa existente.");
            System.out.println("3. Listar todas as tarefas.");
            System.out.println("4. Encerrar o programa.");
            System.out.print("Por favor, escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Adicionar uma nova tarefa
                    System.out.println("Você escolheu Adicionar uma nova tarefa.");

                    System.out.print("Qual a Descrição: ");
                    String descricao = scanner.next();
                    System.out.print("Data de Criação: ");
                    String Data = scanner.next();
                    System.out.print("Status: ");
                    String Status = scanner.next();
                    Tarefa tarefa =  new Tarefa(descricao,Data,Status);
                    listaDeTarefa.adicionarTarefas(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");

                    break;
                case 2:
                    // Remover uma tarefa existente
                    System.out.println("Você escolheu Remover uma tarefa existente.");

                    System.out.print("Digite a descrição da tarefa a ser removida: ");
                    String descricaoParaRemover = scanner.next();
                    listaDeTarefa.removerTarefa(descricaoParaRemover);
                    break;
                case 3:
                    // Listar todas as tarefas
                    System.out.println("Você escolheu Listar todas as tarefas.");

                    System.out.println("Contatos armazenados:");
                    for (Tarefa Tarefa : listaDeTarefa.consultarTarefas()) {
                        System.out.println("Descrição: " + Tarefa.getDescricao());
                        System.out.println("Data de Criação: " + Tarefa.getData());
                        System.out.println("Status: " + Tarefa.getStatus());
                        System.out.println();
                    }
                    break;
                   
                case 4:
                    // Encerrar o programa
                    System.out.println("Encerrando o programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (escolha != 4);

        scanner.close();
    }
}
