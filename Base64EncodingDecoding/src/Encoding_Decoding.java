import java.util.Base64;

//Base64 Encoding is a method used to encode binary data (like images or files) into a text format using only 64 different ASCII characters (A-Z, a-z, 0-9, +, /). This is useful because text encoded in Base64 can be easily transmitted over networks that are designed to handle text data.
//
//Base64 Decoding is the reverse process, converting the Base64-encoded text back into its original binary form.
public class Encoding_Decoding {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, Base64!";

        // Encode the string into Base64
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded: " + encodedString);

        // Decode the Base64 string back to the original string
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded: " + decodedString);

    }

}
