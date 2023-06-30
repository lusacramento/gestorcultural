package br.com.gestorcultural.gestorcultural.utils.hash;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface Hash {
    public String generateHash(String hash) throws NoSuchAlgorithmException,
            UnsupportedEncodingException;
    boolean compareHashs(String hash1, String has2);
}
