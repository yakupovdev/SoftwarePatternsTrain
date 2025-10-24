package Strategy.encryption;

public class CaesarEncryptionImpl implements IEncryptionStrategy{
    private final int shift;

    public CaesarEncryptionImpl(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String str) {
        StringBuilder encryptedWord = new StringBuilder();
        for (char c : str.toCharArray()) {
            encryptedWord.append((char) (c + shift));
        }
        return encryptedWord.toString();
    }

}
