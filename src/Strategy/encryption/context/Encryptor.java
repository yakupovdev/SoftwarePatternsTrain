package Strategy.encryption.context;

import Strategy.encryption.strategy.IEncryptionStrategy;

public class Encryptor {
    private IEncryptionStrategy strategy;

    public Encryptor(IEncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IEncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String data) {
        return strategy.encrypt(data);
    }
}
