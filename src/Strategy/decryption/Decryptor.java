package Strategy.decryption;

public class Decryptor {
    private IDecryptionStrategy strategy;

    public Decryptor(IDecryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IDecryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String decrypt(String str) {
        return strategy.decrypt(str);
    }
}
