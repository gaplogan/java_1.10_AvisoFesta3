public class AvisoFesta3 {
    public static void main(String[] args) throws Exception {
        int j; //declara variável inteira para controle do loop
        j = 1; //inicializa variável de controle do loop

        do //início do loop
        {
            //escreve a frase
            System.out.println("Hoje vai ter festa na casa da Fabi");
            //incrementa variável de controle do loop (contador) 
            j++; // Mesmo que j = j + 1 
        } while (j <= 5); //fim do loop
    }
}
