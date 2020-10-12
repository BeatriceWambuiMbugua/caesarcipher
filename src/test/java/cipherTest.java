import org.junit.Test;

import static org.junit.Assert.*;

public class cipherTest {
    private cipher caesar = new cipher();
    @Test
    public void shouldNotWorkInEmptyString(){
        assertEquals("", caesar.caesarcipher("", 3));
    }

    @Test
    public void shouldAvoidCipherSymbols() {
        assertEquals("-", caesar.caesarcipher("-", 3));
        String symbols = "1!@#$%^&*(){}()/";
         assertEquals(symbols, caesar.caesarcipher(symbols, 3));
    }

    @Test
    public void shouldCipherLowerCaseLetter() {
        assertEquals("a", caesar.caesarcipher("a", 0));
        assertEquals("b", caesar.caesarcipher("a", 1));
        assertEquals("d", caesar.caesarcipher("a", 3));
        assertEquals("j", caesar.caesarcipher("e", 5));
        assertEquals("a", caesar.caesarcipher("z", 1));
        assertEquals("c", caesar.caesarcipher("x", 5));
    }

    @Test
    public void shouldCipherUpperCaseLetter() {
        assertEquals("A", caesar.caesarcipher("A", 0));

        assertEquals("B", caesar.caesarcipher("A", 1));
        assertEquals("D", caesar.caesarcipher("A", 3));
        assertEquals("J", caesar.caesarcipher("E", 5));

        assertEquals("A", caesar.caesarcipher("Z", 1));
        assertEquals("C", caesar.caesarcipher("X", 5));
        assertEquals("Z", caesar.caesarcipher("C", -3));
    }

    @Test
    public void shouldCipherTheWholeAlphabet() {
        String allChars = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", caesar.caesarcipher(allChars, -3));
    }

    @Test
    public void shouldRotate() {
        assertEquals("aoeu-snth", caesar.caesarcipher("aoeu-snth", 52));
        assertEquals("cqgw-upvj", caesar.caesarcipher("aoeu-snth", 54));
    }

    @Test
    public void shouldDecode() {
        String d = "aoeu";
        String encrypted = caesar.caesarcipher(d, 2);
        assertEquals(d, caesar.caesarcipher(encrypted, -2));
    }
}