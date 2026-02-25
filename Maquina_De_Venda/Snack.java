
/**
 * Escreva uma descrição da classe Snack aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Snack extends Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String particularidade;

    /**
     * Construtor para objetos da classe Snack
     */
    public Snack(String nome, double preco, int qtdDisponivel, String imagem, String particulardade)
    {
        // inicializa variáveis de instância
        super(nome, preco, qtdDisponivel, imagem);
        this.particularidade = particularidade;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Particularidade :").append(this.particularidade).append("\n");
        
        return sb.toString(); 
    }
}