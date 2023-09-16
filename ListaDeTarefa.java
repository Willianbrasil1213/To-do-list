import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListaDeTarefa {
    private List<Tarefa> tarefas;

        public ListaDeTarefa (){
            tarefas = new ArrayList<>();
        }

        public void adicionarTarefas(Tarefa tarefa) {
            tarefas.add(tarefa);
        }

        public void RemoverTraefa(String descricao){
            tarefas.removeIf(Tarefa -> Tarefa.getDescricao().equals(descricao));
        }

        public List<Tarefa> consultarTarefas() {
            return tarefas;
        }

        public void removerTarefa(String descricao) {

            Iterator<Tarefa> iterator = tarefas.iterator();
            while (iterator.hasNext()) {
                Tarefa tarefa = iterator.next();
                if (tarefa.getDescricao().equals(descricao)) {
                    iterator.remove(); 
                    System.out.println("Tarefa removida com sucesso.");
                    return; 
                }
            }
            System.out.println("Tarefa não encontrada.");
        }
}
