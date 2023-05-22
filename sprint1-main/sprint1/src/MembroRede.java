public interface MembroRede {
    Pedrada manda(MembroRede membro);
    void mostraPerfil();
    void mudarVisibilidade();
    void manda();
    void escreveNaPedra(Isecmarini membro);
    void conecta(Isecmarini outroMembro);
    void desconectar(Isecmarini outroMembro);
}