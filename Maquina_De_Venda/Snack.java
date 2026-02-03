
/**
 * Escreva uma descrição da classe Snack aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Snack extends Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    /**
     * Construtor para objetos da classe Snack
     */
    public Snack(String nome, double preco, int qtdDisponivel, String imagem)
    {
        // inicializa variáveis de instância
        super(nome, preco, qtdDisponivel, imagem);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}