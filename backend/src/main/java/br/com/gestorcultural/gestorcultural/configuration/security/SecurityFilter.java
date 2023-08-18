package br.com.gestorcultural.gestorcultural.configuration.security;

import br.com.gestorcultural.gestorcultural.model.dto.error.ErrorDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SecurityFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(request.getHeader("Authorization") != null){
            Authentication auth = null;
            try {
                auth = SecurityToken.decodeToken(request);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if(auth != null){
                SecurityContextHolder.getContext().setAuthentication(auth);
            } else {
                ErrorDTO error = new ErrorDTO(401, "Acesso negado!");
                response.setStatus(error.getStatus());
                response.setContentType("application/json");
                ObjectMapper mapper = new ObjectMapper();
                response.getWriter().print(mapper.writeValueAsString(error));
                response.getWriter().flush();
                return
                ;
            }

        }

        filterChain.doFilter(request, response);
    }
}
