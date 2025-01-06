package src.main.java;

import java.util.*;

import static src.main.java.Searching.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Integer> listOfValues;
        System.out.println("ヽ(^o^)丿:" + "'Certo, agora vamos te mostrar na prática o conceito de pesquisa binária (Binary Search)' " + "      (・へ・) :" + " 'hmm, okay'");
        Thread.sleep(1000);
        System.out.println("ヽ(^o^)丿:" + "'Vamos primeiro pegar uma lista de números' " + "      (・へ・) :" + " 'Beleza, quero os números: '");
        listOfValues = replaceSearch(sc.nextLine());
        System.out.println("ಠ_ಠ :" + "'Você os passou de forma ordenada?' " + "      ¯\\_(ツ)_/¯: 'Fiquei devendo nessa ai chefe!'");
        Thread.sleep(1000);
        Collections.sort(listOfValues);
        System.out.println("(´_ゝ`) :" + "'Tudo bem, iremos ordená-los pra ti patrão, se liga ai:" + listOfValues + ". É importante ter em mente que, para a pesquisa binária funcionar, a sua lista deve estar com os elementos ordenados. ' " + "      (T_T)");
        Thread.sleep(1000);
        System.out.println("(/◕ヮ◕)/ :" + "'Certo, agora que os elementos estão ordenados, realizaremos a busca binária. Qual elemento deseja buscar na sua lista? ' " + "       (▀̿̿Ĺ̯̿▀̿ ̿) : 'Quero buscar o elemento: '");
        int value = sc.nextInt();
        String secondsBinary = binarySearch(listOfValues, value);
        String secondsIterator = iteratorSearch(listOfValues, value);
        sc.close();
        System.out.println("(/◕ヮ◕)/ :" + "'Certo, busca realizada!" + "       (▀̿̿Ĺ̯̿▀̿ ̿) : 'Beleza mas cara, como que a busca binária difere da busca por índices percorrendo toda a lista? '");
        System.out.println("༼ಢ_ಢ༽ :" + "'Que orgulho de você cara! Excelente pergunta. Este foi o tempo que a pesquisa binária levou para executar: " + secondsBinary + "s. Enquanto um laço de repeticao através de iteradores, foi: " + secondsIterator +
                "s. Quando entramos no conceito de quanto o seu algoritmo pode escalar, tem um tópico importante chamado 'BigO Notation', ele informa quao rápido seria seu algoritmo. Tenha ideia de 2 casos para o teste: O melhor caso e o pior caso. " +
                " \n Caso o número que você mencionasse fosse o primeiro valor armazenado na listagem, o algoritmo de interacao seria mais rápido certo? Mas imagine o pior caso, na qual seria o último elemento da lista. " +
                " Esse é o contexto da BigO Notation, ele mede o tempo gasto conforme cresce seu algoritmo. Enquanto a iteracao levaria O(n -> sendo 'n' a quantidade de registros na lista), " +
                " \n a pesquisa binária levaria O(logn) pois conforme a lista cresce, ele se mostra cada vez mais útil, tente com uma lista contendo mais de 100 elementos e veja as maravilhas da pesquisa binária. Conseguiu pegar?'" + "       (▀̿̿Ĺ̯̿▀̿ ̿) : 'Aí se mandou a letra patrão'");

    }

}