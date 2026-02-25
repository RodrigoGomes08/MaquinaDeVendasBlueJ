
/**
 * Escreva uma descrição da classe MaquinaDeVendaTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MaquinaDeVendaTest
{
    public static void main(String [] args){
        Utilizador u1 = new Utilizador("teste", "teste@gmail.com", 0.00);
        
        u1.carregarSaldo(100);
        
        MaquinaDeVenda m1 = new MaquinaDeVenda(u1, 1, CriarProdutos.getProdutos(),"Lisboa");
        
        double saldoDepoisDaCompra = m1.comprar(1);
        
        System.out.println("O seu saldo depois da compra é de: " + saldoDepoisDaCompra);
    }
}