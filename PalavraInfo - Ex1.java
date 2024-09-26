import java.util.Scanner;

public class PalavraInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar que o usuário digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Informações sobre a palavra
        int tamanho = palavra.length();
        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(tamanho - 1);
        char letraCentral = tamanho % 2 == 0 ? palavra.charAt(tamanho / 2 - 1) : palavra.charAt(tamanho / 2);
        
        // Palavra escrita ao contrário
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        
        // Palavra em maiúsculas e minúsculas
        String palavraMaiusculas = palavra.toUpperCase();
        String palavraMinusculas = palavra.toLowerCase();
        
        // Exibir os resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + tamanho + " dígitos");
        System.out.println("A primeira letra é: " + primeiraLetra);
        System.out.println("A letra central da palavra é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraInvertida);
        System.out.println("A palavra toda em maiúsculos: " + palavraMaiusculas);
        System.out.println("A palavra toda em minúsculos: " + palavraMinusculas);
        
        scanner.close();
        
        /*COMO FUNCIONA O PROGRAMA

1- Entrada do usuário: O programa pede ao usuário para digitar uma palavra.

2 - Cálculos:
	Calcula o tamanho da palavra.
	Obtém a primeira e a última letras.
	Identifica a letra central (considerando se o comprimento é par ou ímpar).
	Inverte a palavra usando StringBuilder.
	Converte a palavra para maiúsculas e minúsculas.

3- Saída: O programa exibe as informações sobre a palavra digitada.


PARA EXECUTAR O PROGRAMA

1 - Certifique-se de ter o Java instalado no seu computador.

2 - Copie o código acima em um arquivo chamado PalavraInfo.java.

3 - Abra um terminal, navegue até o diretório onde está o arquivo e compile com:
javac PalavraInfo.java

4 - Execute o programa com:
java PalavraInfo


Sinta-se à vontade para modificar ou expandir o programa conforme necessário!*/

    }
}
