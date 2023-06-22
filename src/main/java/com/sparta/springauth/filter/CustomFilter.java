//package com.sparta.springauth.filter;
//
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//public class CustomFilter extends OncePerRequestFilter {
//    // OncePerRequestFilter 한 요청당 한번 필터를 거친다
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String token = request.getHeader("Authorization");
//        // 암호화가 되어있으면 암호화를 풀어주는 코드
////        FastToken token = TokenUtils.getTokenFromHeader("Authorization");
//        SecurityContextHolder.setContext(new SecurityContext() {
//            @Override
//            public Authentication getAuthentication() {
//                return null;
//            }
//            @Override
//            public void setAuthentication(Authentication authentication) {
//
//            }
//        })
//    }
//// OncePerRequestFilter 한 요청당 한번 필터를 거친다
//
//}
