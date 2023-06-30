package br.com.gestorcultural.gestorcultural.utils.hash.impl;

import br.com.gestorcultural.gestorcultural.utils.hash.Hash;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class HashImplTest {

    @Autowired
    Hash hash;
    @BeforeEach
    void setUp() {
        hash = new HashImpl();
    }

    @Test
    void generateHash() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        hash.generateHash("1a2b3c");
        String expectedHash = "96B8B43B198B278C2242DD44ED27E80DD3DCD860BE69CDA1F805EF50E2667760";
        Assertions.assertEquals(expectedHash, hash.generateHash("1a2b3c"));
    }

    @Test
    void compareHashs() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hash1 = hash.generateHash("1a2B3C");
        String hash2 = hash.generateHash("1a2b3c");
        String hash3 = hash.generateHash("1a2B3C");

        Assertions.assertEquals(false, hash.compareHashs(hash1, hash2));
        Assertions.assertEquals(true, hash.compareHashs(hash1, hash3));




    }
}