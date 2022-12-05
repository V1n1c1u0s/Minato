import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM nao suporta UTF-8");
        }
        Scanner scan = new Scanner(System.in);
        String cap0 = "\nO mundo gira ao redor do quão poderoso você é! Você nasceu na aldeia ninja 'Ksaj', que está frequentemente entrando em batalhas para tentar subir na hierarquia de poderes. Aos 7 anos de idade, as crianças são obrigadas a escolherem uma área para se especializarem. Amanhã, você completará a idade necessária para começar o treinamento. Qual será sua escolha?\n\t - Genjutsu\n\t - Taijutsu\n\t - Ninjutsu\nEscolha: ";
        String resposta1;
        String cap0_1 = "\nAo escolher Genjutsu você decidiu se tornar uma sombra. Irá especializar-se em infiltração, ocultação e muitas outras habilidades.";
        String cap0_2 = "\nAo escolher taijutsu, você decidiu tornar seu corpo em uma arma, além de se especializar no manuseio de todas as possíveis armas. Irá aprender a desenvolver explosivos e muitas outras habilidades.";
        String cap0_3 = "\nAo escolher ninjutsu, aprenderá a como utilizar sua energia interna e da natureza para combate e medicina.";
        System.out.print(cap0);
        resposta1 = scan.nextLine().toLowerCase();
        while(true){
            if(resposta1.equals("genjutsu")){
                System.out.println(cap0_1);
                break;
            } else if(resposta1.equals("taijutsu")){
                System.out.println(cap0_2);
                break;
            } else if(resposta1.equals("ninjutsu")){
                System.out.println(cap0_3);
                break;
            }
            else{
                System.out.print("\nERRO : Tente digitar novamente a sua escolha!\n\nEscolha: ");
                resposta1 = scan.nextLine().toLowerCase();
            }
        }
        String cap1 = "\nApós a escolha da área de especialização, os ninjas precisam jurar lealdade a algum clã da aldeia. Sua família teve rixas no passado com o clã kazuma, embora eles sejam os melhores patrocinadores de jovens ninjas, dando os melhores equipamentos e missões. Já o clã Biakuya é bastante amigável com sua família, embora não seja tão afortunado para distribuir equipamentos de última geração para seus integrantes. Ele têm um número de missões próximo ao do primeiro. O terceiro e último clã, é a família jinka que é extremamente rica, mas não faz nenhuma missão, pois são proibidos de deixar a aldeia, devido a serem responsáveis pela guarda dela. A quem você jurará lealdade?\n\t- Kazuma\n\t- Biakuya\n\t- Jinka\nEscolha: ";
        String cap1_1 = "\nEm troca de uma vida mais fácil, você decidiu vencer o orgulho e não deixar as rixas da família interferirem na sua vida.";
        String cap1_2 = "\nVocê decidiu não desonrar sua família, e escolheu um alido para jurar lealdade. Você conquistará seus equipamentos pelo seu próprio mérito.";
        String cap1_3 = "\nVocê decidiu se tornar um guarda da vila, que irá arcar com a segurança e soberania da mesma.";
        System.out.print(cap1);
        String resposta2;
        resposta2 = scan.nextLine().toLowerCase();
        while(true){
            if(resposta2.equals("kazuma")){
                System.out.println(cap1_1);
                break;
            } else if(resposta2.equals("biakuya")){
                System.out.println(cap1_2);
                break;
            } else if(resposta2.equals("jinka")){
                System.out.println(cap1_3);
                break;
            }
            else{
                System.out.print("\nERRO : Tente digitar novamente a sua escolha!\n\nEscolha: ");
                resposta2 = scan.nextLine().toLowerCase();
            }
        }
        scan.close();
    }
}
