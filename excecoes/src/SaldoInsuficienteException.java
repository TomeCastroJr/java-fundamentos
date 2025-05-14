public class SaldoInsuficienteException extends Exception {
    //toda classe que herda de Exception, tem que enviar pelo menos a mensagem
    //getMessage -> mensagem

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
