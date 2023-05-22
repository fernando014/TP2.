public class Riola {
    private Pedrada[] pedradas;
    private int count;

    public Riola(int tamanho) {
        pedradas = new Pedrada[tamanho];
        count = 0;
    }
    public void addPedrada(Pedrada pedrada) {
        if (count < pedradas.length) {
            pedradas[count] = pedrada;
            count++;
        } else {
            System.out.println("A Riola esta completamente cheia. Nao sera possivel adicionar mais pedradas.");
        }
    }

    public void show() {
        if (count == 0) {
            System.out.println("A Riola esta vazia e nao tem pedradas para mostrar.");
        } else {
            System.out.println("Pedradas na Riola:");
            for (int i = 0; i < count; i++) {
                System.out.println("Pedrada " + (i + 1) + ": " + pedradas[i].getTexto());
            }
        }
    }
    public static void main(String[] args) {
        Riola riola = new Riola(5);

        Pedrada pedrada1 = new Pedrada("primeira pedrada");
        Pedrada pedrada2 = new Pedrada("segunda pedrada");
        Pedrada pedrada3 = new Pedrada("terceira pedrada");

        riola.addPedrada(pedrada1);
        riola.addPedrada(pedrada2);
        riola.addPedrada(pedrada3);
        riola.show();
    }
}