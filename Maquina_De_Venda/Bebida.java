
/**
 * Escreva uma descrição da classe Bebida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Bebida extends Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    public Bebida(String nome, double preco, int qtdDisponivel, String imagem)
    {
        // inicializa variáveis de instância
        super(nome, preco, qtdDisponivel, imagem);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}