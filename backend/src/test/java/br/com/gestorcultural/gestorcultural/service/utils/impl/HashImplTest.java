package br.com.gestorcultural.gestorcultural.service.utils.impl;

import br.com.gestorcultural.gestorcultural.service.utils.Hash;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

class HashImplTest {


    @Test
    void generateHash() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Hash.generateHash("1a2b3c");
        String expectedHash = "96B8B43B198B278C2242DD44ED27E80DD3DCD860BE69CDA1F805EF50E2667760";
        Assertions.assertEquals(expectedHash, Hash.generateHash("1a2b3c"));
    }

    @Test
    void compareHashs() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hash1 = Hash.generateHash("1a2B3C");
        String hash2 = Hash.generateHash("1a2b3c");
        String hash3 = Hash.generateHash("1a2B3C");

        Assertions.assertEquals(false, Hash.compareHashs(hash1, hash2));
        Assertions.assertEquals(true, Hash.compareHashs(hash1, hash3));




    }
}