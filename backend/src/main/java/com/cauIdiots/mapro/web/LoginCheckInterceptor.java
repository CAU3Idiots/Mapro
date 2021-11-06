//package com.cauIdiots.mapro.web;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@Slf4j
//public class LoginCheckInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String requestURI = request.getRequestURI();
//
//        log.info("로그인 인증 시작 {}",requestURI);
//
//        HttpSession httpSession = request.getSession(false);
//
//        if(httpSession == null || httpSession.getAttribute(SessionConst.LOGIN_MEMBER) == null) {
//            log.info("미인증 사용자 접");
////            response.setStatus(HTTpServletResponse.);
//            return false;
//        }
//
//        return true;
//    }
//}
