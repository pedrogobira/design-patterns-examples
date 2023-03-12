package serializacaosingleton;

import java.io.Serializable;

public class SerializacaoSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private static SerializacaoSingleton serializacaosingleton;

    private String situacao = "teste";

    private SerializacaoSingleton() {
    }

    public static SerializacaoSingleton getSerializacaoSingleton() {
        if (serializacaosingleton == null) {
            serializacaosingleton = new SerializacaoSingleton();
        }
        return serializacaosingleton;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /*
    Comente o método readResolve caso seja desejado a desserialização respeitando os dados armazenados em vez do padrão Singleton
    */
    protected Object readResolve() {
        return getSerializacaoSingleton();
    }
}
