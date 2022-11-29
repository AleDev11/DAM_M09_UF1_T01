package font.alejandro.dam.m09.uf1.t01;


import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncriptacionMD5 {
    public String EncriptarMD5(String _text) {
        String result = null;

        try {
            MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            md.update(_text.getBytes());
            byte[] digestBytes = md.digest();

            result = Base64.getEncoder().encodeToString(digestBytes);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("[ERROR] Error al encriptar los datos");
            e.printStackTrace();
        }

        return result;
    }
}
