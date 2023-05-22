class PedradaEvento extends Pedrada {
    private TipoEvento tipo;
    private String data;
    private String local;
    private String status;
    private String entrada;

    public PedradaEvento(String username, TipoEvento tipo, String data, String local, String entrada, String status) {
        super(username);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }
    public String getData() {
        return data;
    }
    public String getStatus() {
        return status;
    }
    public String getLocal() {
        return local;
    }
}
