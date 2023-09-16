
public class Tarefa {

    String descricao;
    String data;
    String Status;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public Tarefa(String descricao, String data, String status) {
        this.descricao = descricao;
        this.data = data;
        Status = status;
    }


  
}

