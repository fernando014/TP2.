public class Funcionario {
    private String funcao;
    private String uo;

    public Funcionario(String uo, String funcao) {
        this.funcao = funcao;
        this.uo = uo;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getUo() {
        return uo;
    }


    public static void main(String[] args) {
        // como usar
        String uo = "RH";
        String funcao = "Analista";

        Funcionario funcionario = new Funcionario(uo, funcao);

        System.out.println("Detalhes do funcionario:");
        System.out.println("UO: " + funcionario.getUo());
        System.out.println("Funcao: " + funcionario.getFuncao());
    }
}
