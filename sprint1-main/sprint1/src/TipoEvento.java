public enum TipoEvento {
    SENTOD("Sentod"),
    FESTA("Festa"),
    PASSEIO("Passeio"),
    VISITA_ESTUDO("Visita de Estudo");

    private String descricao;
    private TipoEvento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public static void main(String[] args) {
        TipoEvento tipoEvento = TipoEvento.FESTA;
        System.out.println("Tipo de evento: " + tipoEvento.getDescricao()); }
}
