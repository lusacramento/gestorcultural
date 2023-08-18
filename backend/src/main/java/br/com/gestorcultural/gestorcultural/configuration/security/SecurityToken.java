package br.com.gestorcultural.gestorcultural.configuration.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import java.util.Collections;

public class SecurityToken {
    public static Authentication decodeToken(HttpServletRequest request) throws Exception{
        if(request.getHeader("Authorization").equals("Bearer 123456"))
            return new UsernamePasswordAuthenticationToken("user", null, Collections.emptyList());
        return null;
    }
}
