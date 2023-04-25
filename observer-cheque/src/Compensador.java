public class Compensador extends Observavel {
    public boolean executa(Cheque cheque) throws RuntimeException {
        if (cheque.getPagador().getSaldo().compareTo(cheque.getValor()) == -1) {
            notificaObservadores(cheque);
            return false;
        }
        cheque.getPagador().setSaldo(cheque.getPagador().getSaldo().subtract(cheque.getValor()));
        cheque.getRecebedor().setSaldo(cheque.getRecebedor().getSaldo().add(cheque.getValor()));
        cheque.setCompensado(true);
        return true;
    }
}
