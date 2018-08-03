package com.auth0.example;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.security.enterprise.credential.Credential;

public class Auth0JwtCredential implements Credential {

    private final String subject;
    private final Set<String> roles;

    public Auth0JwtCredential(final String token) {
        DecodedJWT jwt = JWT.decode(token);
        this.subject = jwt.getSubject();
        this.roles = Collections.unmodifiableSet(new HashSet<>()); //TODO: Set roles claim
    }

    public String getSubject() {
        return subject;
    }

    public Set<String> getRoles() {
        return roles;
    }
}