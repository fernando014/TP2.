public class Evento {
    private int id;
    private String nome;
    private TipoEvento tipo;

    public Evento(int id, String nome, TipoEvento tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public static void main(String[] args) {
        Evento evento = new Evento(1, "Festa de Aniversário", TipoEvento.FESTA);
        System.out.println("Detalhes do evento:");
        System.out.println("ID: " + evento.getId());
        System.out.println("Nome: " + evento.getNome());
        System.out.println("Tipo: " + evento.getTipo());
    }
}
