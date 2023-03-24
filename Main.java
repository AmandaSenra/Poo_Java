public class Main {
    public static void main(String[] args) {
        Filme fil = new Filme();
        fil.cinema = "Cinema: Cinemark Barra";
        fil.sala = "Sala: 08";
        fil.genero = "Classificação: Terror\n";
        fil.gravar();
        System.out.println(fil.toString());

        Teatro tea = new Teatro();
        tea.nome = "Nome: Teatro Municipal";
        tea.local = "Local: Cinelândia - Rio de Janeiro ";
        tea.capacidade = 100;
        tea.gravar();
        System.out.println(tea.toString());

        Show showNovo = new Show();
        showNovo.artista = "Artista: Amanda Senra\n";
        showNovo.gravar();
        System.out.println(showNovo);

        Ingresso ingresTotal = new Ingresso();
        ingresTotal.valor = 50.00;
        System.out.println(ingresTotal.toString());

        IngressoVip ingres = new IngressoVip();
        ingres.valor = 50.00;
        ingres.valorAdicional = 7.50;
        System.out.println("Valor Vip: " + ingres.calcularValor());

        }
    }
