public class Filme extends Evento {
    String cinema;
    String sala;
    String genero;


    @Override
    public void gravar(){
        System.out.println("Evento eh ---");
    }
    @Override
    public String toString() {
        return "Filme\n" + this.cinema +"\n" + this.sala + "\n" + this.genero;
    }
}
