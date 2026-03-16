public class Atividade8 {

    // 1. Criando a função que recebe os dois arrays e retorna o resultante
    public static double[] fazerMerge(double[] array1, double[] array2) {
        
        // O tamanho do novo array é a soma dos tamanhos dos dois originais
        int tamanhoTotal = array1.length + array2.length;
        double[] resultante = new double[tamanhoTotal];

        // "Inicialmente o programa se posiciona no início de ambos os arrays"
        int i = 0; // Aponta para os elementos do array 1
        int j = 0; // Aponta para os elementos do array 2
        int k = 0; // Aponta para onde vamos inserir no array resultante

        // "Isto irá acontecer até que se chegue ao fim de UM dos vetores"
        // O laço continua enquanto 'i' e 'j' estiverem dentro do limite de seus arrays
        while (i < array1.length && j < array2.length) {
            
            // "Se o elemento atual do array 1 for menor..."
            if (array1[i] < array2[j]) {
                resultante[k] = array1[i]; // Transfere para o resultante
                i++; // Desloca para o próximo elemento do array 1
            } 
            // "Se o elemento do array 2 for menor..."
            else {
                resultante[k] = array2[j]; // Transfere para o resultante
                j++; // Desloca para o próximo elemento do array 2
            }
            k++; // Sempre deslocamos para a próxima posição vazia no resultante
        }

        // "Neste momento o programa descarrega o restante do array que não terminou"
        // Apenas um dos laços abaixo (while) vai executar, pois o outro já chegou ao fim.
        
        // Descarrega o resto do array 1 (se sobrou algo)
        while (i < array1.length) {
            resultante[k] = array1[i];
            i++;
            k++;
        }

        // Descarrega o resto do array 2 (se sobrou algo)
        while (j < array2.length) {
            resultante[k] = array2[j];
            j++;
            k++;
        }

        // Retorna o array final mesclado e ordenado
        return resultante;
    }

    public static void main(String[] args) {
        // Criando duas listas de preços de teste, já em ordem crescente
        double[] precosLista1 = {1.50, 3.20, 5.00, 8.90};
        double[] precosLista2 = {2.00, 4.50, 6.10, 7.00, 10.50};

        // Chamando a nossa função e guardando o resultado
        double[] precosFinais = fazerMerge(precosLista1, precosLista2);

        // Exibindo o resultado para conferir
        System.out.println("--- Array Resultante (Merge) ---");
        for (int x = 0; x < precosFinais.length; x++) {
            System.out.print(precosFinais[x] + " | ");
        }
    }
}