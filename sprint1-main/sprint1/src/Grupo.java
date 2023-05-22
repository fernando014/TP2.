import java.util.Date;

public class Grupo {
    private int id;
    private Date data;
    private String estado;

    public Grupo(int id, Date data, String estado) {
        this.id = id;
        this.data = data;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int id = 1;
        Date data = new Date();
        String estado = "Ativo";

        Grupo grupo = new Grupo(id, data, estado);

        System.out.println("Detalhes do grupo:");
        System.out.println("ID: " + grupo.getId());
        System.out.println("Data: " + grupo.getData());
        System.out.println("Estado: " + grupo.getEstado());
    }
}

