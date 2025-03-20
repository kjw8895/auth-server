//package com.auth.api.master.config;
//
//import com.auth.api.master.config.property.JwtProperties;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@EnableConfigurationProperties(JwtProperties.class)
//@RequiredArgsConstructor
//public class JwtTokenFilter extends OncePerRequestFilter {
//    private final JwtTokenProvider jwtTokenProvider;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String accessToken = extractToken(request, "Authorization");
//
//        if (accessToken != null && jwtTokenProvider.validateToken(accessToken)) {
//            Authentication authentication = jwtTokenProvider.getAuthentication(accessToken);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }
//
//        filterChain.doFilter(request, response);
//    }
//
//    private String extractToken(HttpServletRequest request, String headerName) {
//        String header = request.getHeader(headerName);
//        if (header != null && header.startsWith("Bearer ")) {
//            return header.substring(7);
//        }
//        return request.getHeader(headerName);
//    }
//}
