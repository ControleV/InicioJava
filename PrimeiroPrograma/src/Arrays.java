import java.util.ArrayList;

public class Arrays {
    public static void main (String[] args) {
        /*Ligação direta -- Mais paia*/
        int[] idades1 = {2, 3, 4};
        idades1[0] = 22;


        /*Ligação avançada -- Mais legal*/
        int[] idades2 = new int[10];
        idades2[0] = 22;



        /*Outros ex: */
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = new boolean[10];


        /*Ligação dinâmica -- Altera o tamanho da array dinamicamente*/
        ArrayList<Integer> pecados = new ArrayList<Integer>();
        pecados.add(666);
        pecados.add(999);
        pecados.add(777);
        pecados.set(2, 323334);
        pecados.remove(1);

        System.out.println(pecados.get(0));
        System.out.println(pecados.size());
    }
}
