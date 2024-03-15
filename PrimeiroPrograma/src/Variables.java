public class Variables {
    public static void main(String[] args) {
        /*Variáveis de escopo local: metodo main*/
        var nome = "Fernanda";



        /*Variáveis de escopo global: metodo main*/
        int idade = 22;
        int salario;

        salario = 400;



        /*Tipos primitivos
         *
         * NÚMEROS INTEIROS
         * 
         * byte ------------ Representa inteiros pequenos (-128 | 127).
         * short ----------- Um pouco maior.
         * int ------------- Maiorzão.
         * long ------------ Esse é o famoso 16 toneladas.
         * 
         * NÚMEROS QUEBRADOS
         * 
         * double ---------- Representa números de pontos flutuantes com mais precisão (maiores)
         * float ----------- Representa números de pontos flutuantes com menos precisão (menores)
         * 
         * PRECISA DO 'f' DEPOIS DO NÚMERO QUEBRADO!
        */

        boolean eBrasileiro = true;  /*----------------- Verdadeiro ou falso*/

        char letra = 'A';  /*----------------- Armazenar um caractere*/

        String nome2 = "Fernanda";  /*--------------- Não é um tipo primitivo, mas é usado para guardar strings*/
    }
}
