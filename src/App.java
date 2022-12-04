import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM nao suporta UTF-8");
        }
        String cap0 = "\nO mundo gira ao redor do quão poderoso você é! Você nasceu na aldeia ninja 'Ksaj', que está frequentemente entrando em batalhas para tentar subir na hierarquia de poderes. Aos 7 anos de idade, as crianças são obrigadas a escolherem uma área para se especializarem. Amanhã, você completará a idade necessária para começar o treinamento. Qual será sua escolha?\n\t - Espionagem\n\t - Guerrilha\n\t - Envenenamento";
        System.out.println(cap0);

    }
}
