package Strategy.encryption;

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
