public interface ModeradorGrupo {
    void criar();
    void apagar();
    void adicionarMembro(String membro);
    void muteMembro(String membro);
    void removerMembro(String membro);
    void moderar();
}
