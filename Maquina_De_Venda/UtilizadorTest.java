
/**
 * Escreva uma descrição da classe UtilizadorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UtilizadorTest
{
    public static void main(String[] args){
        Utilizador u1 = new Utilizador("teste", "teste@gmail.com", 0.00);
        Utilizador u2 = new Utilizador("teste", "teste@gmail.com", 0.00);
        
        double saldoInicial = u1.getSaldo();
        System.out.println("Saldo atual é: " + saldoInicial);
        
        double saldoCarregado = u1.carregarSaldo(100.0);
        System.out.println("Saldo atual é: " + saldoCarregado);
        
        double saldoDescontado = u1.descontarSaldo(50.0);
        System.out.println("Saldo atual é: " + saldoDescontado);
    }
}