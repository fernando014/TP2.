public class PedradaDigital {
    private Isecmarini[] comunidade;
    private String[] grupos;
    private Pedrada[] pedradas;
    private String[] eventos;

    public PedradaDigital(Isecmarini[] comunidade, Pedrada[] pedradas, String[] grupos, String[] eventos) {
        this.comunidade = comunidade;
        this.pedradas = pedradas;
        this.grupos = grupos;
        this.eventos = eventos;
    }
    public void signin() {
        // Implementacao do metodo signin
    }
    public void signoff() {
        // Implementacao do metodo signoff
    }
    public Isecmarini signup() {
        // Implementacao do metodo signup
        return new Isecmarini();
    }
}