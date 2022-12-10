public class User {
    private int chakra;
    private String nome, habilidade, clan;

    public User(String nome, int chakra){
        this.nome = nome;
        this.chakra = chakra;
    }

    public void barraDeVida(){
        if(this.chakra <= 0)
            System.out.printf("\n===================================================\nNome: %s\t\t\tMorto \n===================================================\n",this.nome);
        else
            System.out.printf("\n===================================================\nNome: %s\t\t\tChakra: %d\n===================================================\n",this.nome,this.chakra);
    }

    public void habilidade( String habilidade){
        this.habilidade = habilidade;
    }

    public void subordinadoDoClan(String clan){
        this.clan = clan;
    }

    public void alterarChakra(int chakra){
        this.chakra = chakra;
    }

    public String getHabilidade(){
        return this.habilidade;
    }

    public String getClan(){
        return this.clan;
    }
}
