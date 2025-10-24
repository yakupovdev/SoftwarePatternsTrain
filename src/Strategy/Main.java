package Strategy;

import Strategy.decryption.CaesarDecryptionImpl;
import Strategy.decryption.Decryptor;
import Strategy.decryption.ResverseDecryptionImpl;
import Strategy.encryption.CaesarEncryptionImpl;
import Strategy.encryption.Encryptor;
import Strategy.encryption.ReverseEncryptionImpl;

public class Main {
    public static void main(String[] args) {
        String word = "Hello World";

        Encryptor encryptor = new Encryptor(new CaesarEncryptionImpl(5));
        Decryptor decryptor = new Decryptor(new CaesarDecryptionImpl(5));

        System.out.println("Encrypted word: " + encryptor.encrypt(word));
        System.out.println("Decrypted word: " + decryptor.decrypt(encryptor.encrypt(word)) + "\n");

        encryptor.setStrategy(new ReverseEncryptionImpl());
        decryptor.setStrategy(new ResverseDecryptionImpl());

        System.out.println("Encrypted word: " + encryptor.encrypt(word));
        System.out.println("Decrypted word: " + decryptor.decrypt(encryptor.encrypt(word)));
    }
}
