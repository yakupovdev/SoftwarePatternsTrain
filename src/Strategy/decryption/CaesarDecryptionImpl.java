package Strategy.decryption;

public class CaesarDecryptionImpl implements IDecryptionStrategy {
    private final int shift;

    public CaesarDecryptionImpl(int shift) {
        this.shift = shift;
    }

    @Override
    public String decrypt(String str) {
        StringBuilder decryptedWord = new StringBuilder();
        for (char c : str.toCharArray()) {
            decryptedWord.append((char) (c - shift));
        }
        return decryptedWord.toString();
    }
}
