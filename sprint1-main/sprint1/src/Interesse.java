public class Interesse {
    private String descricao;

    public Interesse(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public static void main(String[] args) {
        Interesse interesse = new Interesse("Dados pessoais");
        System.out.println("Descri��o do interesse: " + interesse.getDescricao());
    }
}
