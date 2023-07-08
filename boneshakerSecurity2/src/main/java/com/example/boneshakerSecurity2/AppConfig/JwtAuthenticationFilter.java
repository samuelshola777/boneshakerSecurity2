package com.example.boneshakerSecurity2.AppConfig;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@AllArgsConstructor
@Component
@Configuration
//TODO: to make ths class a string bean we have to annotate with @component or @Service
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,@NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
// TODO: when we send a request we need to pass the authentication token withen the header
        //TODO : to check we our request have jwt authentication token
       //TODO : trying to extract the header called authorization
        final String authenticationHeader = request.getHeader("Authorization");
        final String jwt;
        if (authenticationHeader == null || authenticationHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

    }
}
