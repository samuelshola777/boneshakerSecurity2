package com.example.boneshakerSecurity2.AppConfig;

import com.example.boneshakerSecurity2.JWTservice.JwtService;
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

   private final JwtService  jwtService;
    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,@NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {

        // TODO: when we send a request we need to pass the authentication token withen the header of the request
        //TODO : to check we our request have jwt authentication token
       //TODO : trying to extract the header called authorization


        final String authenticationHeader = request.getHeader("Authorization");
        final String jwt;


        // TODO: we have to extract the user email from our Jwt authentication token
        final String userEmail;


        //TODO: we want to check if out jwt authentication token header is null or
    //    TODO: start with the keyword string Bearer and a space


        if (authenticationHeader == null ||! authenticationHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;


    //TODO: we have to break the method by using the keyword "return"so it will return a 403 to the unAuthorize user
        }

    //TODO: here is the Else part of the method where we extract to Jwt token from the headers
// T: we have to extract the Bearer and the white space from the token header that why we have the subString method

        jwt = authenticationHeader.substring(7);
    // TODO: now we have our the authentication token

    //TODO: where we extract our user email from  token using our jwt service call calling the extract username method
        userEmail = jwtService.extractUserName()
    }
}
