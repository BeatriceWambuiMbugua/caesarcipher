public class App {
    public static void main(String[] args) {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipher = Cipher.encrypt(text, 23);
        System.out.println(cipher);
        String decrypted = Decipher.decrypt(cipher, 23);
        System.out.println(decrypted);
    }
}
