public class PedradaFoto {
    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto(String nomeFicheiro, String legenda) {
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }
    public String getNomeFicheiro() {
        return nomeFicheiro;
    }
    public String getLegenda() {
        return legenda;
    }
    public static void main(String[] args) {
        PedradaFoto foto = new PedradaFoto("foto.jpg", "Uma foto linda!");
        System.out.println("O Nome do ficheiro: " + foto.getNomeFicheiro());
        System.out.println("Legenda: " + foto.getLegenda());
    }
}

