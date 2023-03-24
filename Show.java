public class Show extends Evento{
    String artista;

    @Override
    public void gravar(){
        System.out.println("\nEvento eh ---");
    }

    @Override
    public String toString(){
        return "Show\n" + this.artista;
    }
}
