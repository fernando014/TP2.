 class Professor extends Isecmarini implements ModeradorGrupo {
    private String área;
    private String grau;
    private String departamento;

    public Professor(String username, String área, String grau, String departamento) {
        super(username);
        this.área = área;
        this.grau = grau;
        this.departamento = departamento;
    }

    public void mandaColegas() {
        // Implementação do método mandaColegas
        System.out.println("Enviando mensagem para colegas...");
    }

    // Implementação dos métodos da interface ModeradorGrupo
    @Override
    public void criar() {
        // Implementação do método criar
        System.out.println("Criando grupo...");
    }

    @Override
    public void apagar() {
        // Implementação do método apagar
        System.out.println("Apagando grupo...");
    }

    @Override
    public void adicionarMembro() {
        // Implementação do método adicionarMembro
        System.out.println("Adicionando membro ao grupo...");
    }

    @Override
    public void muteMembro() {
        // Implementação do método muteMembro
        System.out.println("Silenciando membro do grupo...");
    }

    @Override
    public void removerMembro() {
        // Implementação do método removerMembro
        System.out.println("Removendo membro do grupo...");
    }

    @Override
    public void moderar() {
        // Implementação do método moderar
        System.out.println("Moderando grupo...");
    }
}

