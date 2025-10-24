package Strategy.decryption;

public class ResverseDecryptionImpl implements IDecryptionStrategy {
    @Override
    public String decrypt(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
