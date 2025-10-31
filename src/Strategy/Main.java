package Strategy;

import Strategy.decryption.strategyImpl.CaesarDecryptionImpl;
import Strategy.decryption.context.Decryptor;
import Strategy.decryption.strategy.IDecryptionStrategy;
import Strategy.decryption.strategyImpl.ReverseDecryptionImpl;
import Strategy.encryption.strategyImpl.CaesarEncryptionImpl;
import Strategy.encryption.context.Encryptor;
import Strategy.encryption.strategyImpl.ReverseEncryptionImpl;

public class Main {
    public static void main(String[] args) {
        String word = "Hello World";

        Encryptor encryptor = new Encryptor(new CaesarEncryptionImpl(5));
        Decryptor decryptor = new Decryptor(new CaesarDecryptionImpl(5));

        System.out.println("Encrypted word: " + encryptor.encrypt(word));
        System.out.println("Decrypted word: " + decryptor.decrypt(encryptor.encrypt(word)) + "\n");

        encryptor.setStrategy(new ReverseEncryptionImpl());
        decryptor.setStrategy(new ReverseDecryptionImpl());

        System.out.println("Encrypted word: " + encryptor.encrypt(word));
        System.out.println("Decrypted word: " + decryptor.decrypt(encryptor.encrypt(word)));
    }
}
