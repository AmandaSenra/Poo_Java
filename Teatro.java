public class Teatro extends Evento{
    @Override
    public void gravar(){
        System.out.println("Evento eh ---");
    }

    @Override
    public String toString(){
        return "Teatro\n" + this.nome + "\n" + this.local + "\n" + "Capacidade: " + this.capacidade ;
    }
}
