package com.unq.copistas.security.jwt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//esta clase se fija si hay un token valido
//si no , devuelve un 401 unauthorized
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {


    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e) throws IOException, ServletException {
        //esto se utiliza solo en desarrollo
        logger.error("failed en el metodo commence");
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");
    }


}
