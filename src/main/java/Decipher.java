public class Decipher {
    public static String decrypt (String message, int shift ){
        if (shift>26){
            shift = shift%26;
        }else if (shift<0){
            shift = (shift%26)+26;
        }
        String caesarMessage = "";
        int length = message.length();
        for (int i = 0; i<length; i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch-shift);
                    if (c<'a'){
                        caesarMessage +=(char)(ch+(26-shift));
                    } else{
                        caesarMessage += c;
                    }

                } else if (Character.isUpperCase(ch)) {
                    char c = (char)(ch-shift);
                    if (c<'A'){
                        caesarMessage +=(char)(ch+(26-shift));
                    } else{
                        caesarMessage += c;
                    }

                }
            } else {
                caesarMessage += ch;
            }
        }
        return caesarMessage;
    }
}
