package com.security.service;

import com.security.dao.request.SignUpRequest;
import com.security.dao.request.SigninRequest;
import com.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
