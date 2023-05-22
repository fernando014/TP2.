public class PedradaMensagem {
    private String mensagem;

    public PedradaMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTexto() {
        return mensagem;
    }

    public static void main(String[] args) {
        PedradaMensagem mensagem = new PedradaMensagem("hy, mundo!");
        System.out.println("Texto da mensagem: " + mensagem.getTexto());
    }
}
