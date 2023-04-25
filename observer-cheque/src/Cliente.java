public class Cliente {
    private final String nome;
    private final String ultimoNome;
    private final String cpf;

    public Cliente(String nome, String ultimoNome, String cpf) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        if (cpf.length() != 11) {
            throw new RuntimeException("CPF invalido");
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
