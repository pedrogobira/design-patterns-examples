package serializacaosingleton;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializacaoSingleton serializacaosingleton = SerializacaoSingleton.getSerializacaoSingleton();

        serializacaosingleton.setSituacao("teste 1");

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("teste.txt"));
        out.writeObject(serializacaosingleton);
        out.close();


        ObjectInput in = new ObjectInputStream(new FileInputStream("teste.txt"));
        SerializacaoSingleton serializacaosingletonrecovery = (SerializacaoSingleton) in.readObject();
        in.close();


        System.out.println(serializacaosingleton.getSituacao());
        System.out.println(serializacaosingletonrecovery.getSituacao());
    }
}
