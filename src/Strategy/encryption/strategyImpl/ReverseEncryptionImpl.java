package Strategy.encryption.strategyImpl;

import Strategy.encryption.strategy.IEncryptionStrategy;

public class ReverseEncryptionImpl implements IEncryptionStrategy {
    @Override
    public String encrypt(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
