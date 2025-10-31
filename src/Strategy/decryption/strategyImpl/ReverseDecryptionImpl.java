package Strategy.decryption.strategyImpl;

import Strategy.decryption.strategy.IDecryptionStrategy;

public class ReverseDecryptionImpl implements IDecryptionStrategy {
    @Override
    public String decrypt(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
