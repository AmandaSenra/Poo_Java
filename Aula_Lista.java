public class Aula_Lista {
    public static void main(String[] args) {
        int[] listaAmanda = {5,4,3,2,1};

        System.out.println("Lista inicial: ");
        for (int novLista : listaAmanda) {
            System.out.println(novLista);}
        System.out.println("---------");

        int[] newAmanda = append(listaAmanda, 6);
        System.out.println("Elemento 5: " + newAmanda[5]);
        System.out.println("---------");

        int[] pop1 = pop(listaAmanda);
        System.out.println("Lista sem o ultimo valor:");
        for (int i=0; i < pop1.length; i++){
            System.out.println(pop1[i]);}
        System.out.println("---------");

        pop(listaAmanda,1);

        ordinario(listaAmanda);
        System.out.println("Lista inicial em ordem crescente:");
        for (int i=0; i < listaAmanda.length; i++){
            System.out.println(ordinario(listaAmanda)[i]);}
    }

        public static int[] append(int[] listaAmanda, int valor) {
            int[] novoArray = new int[listaAmanda.length +1];

            for (int i = 0; i < listaAmanda.length; i++) {
                novoArray[i] = listaAmanda[i];
            }

            novoArray[novoArray.length - 1] = valor;

            return novoArray;
        }

        public static int[] pop(int[] listaAmanda) {
            System.out.println( "Ultimo valor da lista pra ser retirado:");
            int[] novoArray = new int[listaAmanda.length -1];

            for (int i = 0; i < listaAmanda.length -1; i++) {
                novoArray[i] = listaAmanda[i];
            }

            System.out.println(listaAmanda[listaAmanda.length -1]);
            System.out.println("---------");

            return novoArray;
        }

        public static int[] pop(int[] listaAmanda, int indice) {
            int[] novoArray = new int[listaAmanda.length -1];
            int j =0;
        for (int i = 0; i < listaAmanda.length; i++) {
            if(i == indice){
                System.out.println("Valor do indice [1] da lista: ");
                System.out.println(listaAmanda[indice]);
                System.out.println("---------");
            }else{
                novoArray[j] = listaAmanda[i];
                j++;
            }
        }
        return novoArray;
        }

        public static int[] ordinario(int[] listaAmanda) {
            int decrescente = 0;
            int crescente = 0;
            for (int i = 0; i < listaAmanda.length; i++) {
                for (int j = 0; j < listaAmanda.length; j++) {
                    if (listaAmanda[crescente] > listaAmanda[j]) {
                        decrescente = listaAmanda[j];
                        listaAmanda[j] = listaAmanda[crescente];
                        listaAmanda[crescente] = decrescente;
                        crescente++;
                    }
                }
                crescente = 0;
            }

        return listaAmanda;
    }

}