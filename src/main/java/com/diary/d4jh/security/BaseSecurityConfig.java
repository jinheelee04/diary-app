package com.diary.d4jh.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration //IoC 빈(bean, 인스턴스)를 등록
@EnableWebSecurity//필터 체인 관리 시작 어노테이션
@EnableGlobalMethodSecurity(prePostEnabled = true) //컨트롤러 접근 전에 낚아챔, 특정 주소 접근시 권한 및 인즌 미리 체크
public class BaseSecurityConfig extends WebSecurityConfigurerAdapter {
    // 암호화 방식 빈(Bean) 생성
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Value("${application.security.rememberMe.cookieName:rememberMe}")
    String rememberMeCookieName;

    @Autowired
    UserDetailsService userDetailService;

    private static final String REMEMBER_ME_KEY = "sampleRememberMeKey";
    private WebSecurity web;

    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/fonts/**", "/vendor/**"); //정적 콘텐츠 액세스는 인증을 걸지 않음
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailService) //UserDetailService 인터페이스를 구현한 독자적 인증 문자열(realm)을 사용한다.
                .passwordEncoder(passwordEncoder());
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        String[] permittedUrls = {  "/login", "/join"};

        http.csrf().csrfTokenRepository(new CookieCsrfTokenRepository());
        http.authorizeRequests()
                .antMatchers(permittedUrls).permitAll() //인증을 걸지 않는 엔드포인트를 명확히 지정
                .anyRequest().authenticated()
//                // user 페이지 설정
//                .antMatchers("/user/**")
//                .authenticated() // 로그인 필요
//                // 기타 url은 모두 허용
//                .anyRequest()
//                .permitAll()
                .and()
                // 로그인 페이지 사용
                .formLogin()
                .loginPage("/login") // 로그인 페이지 경로 설정
                .loginProcessingUrl("/authenticate") // 로그인이 실제 이루어지는 곳 //필터체인에서 인지하고 있다가 시큐리티가 낚아채서 Authentication Manager
                .defaultSuccessUrl("/user/index") // 로그인 성공 후 기본적으로 리다이렉트되는 경로
                .and()
                .logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");
    }



//    @Override
//    protected void configure(HttpSecurity http)throws Exception{
//        String[] permittedUrls = {  "/login", "/join"};
//
//        http.authorizeRequests()
//                .antMatchers(permittedUrls).permitAll() //인증을 걸지 않는 엔드포인트를 명확히 지정
//                .anyRequest().authenticated()
//                .and()
//                .exceptionHandling();
//                //세션 시간이 초과했을 때 메시지를 표시하는 AuthenticationEntryPoint를 직접 구현하고 사용하도록 설정
////                .authenticationEntryPoint(authenticationEntryPoint())
////                .accessDeniedHandler(accessDeniedHandler());
//
//        http.formLogin()
//                //로그인 화면의 URL
//                .loginPage("/login")
//                //인가를 처리하는 URL
//                .loginProcessingUrl("/authenticate")
//                //로그인 성공시 전이할 곳
//                .successForwardUrl("/index")
//                //로그인 실패시 전이할 곳
//                .failureUrl("/login")
//                //로그인 ID의 파라미터명
//                .usernameParameter("email")
//                //패스워드의 파라미터명
//                .passwordParameter("pwd").permitAll();
//        http.logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                //쿠키 파기
//                .deleteCookies("SESSION", "JSESSIONID")
//                //로그아웃 화면 URL
//                .logoutUrl("/logout")
//                //로그아웃 후 전이할 곳
//                .logoutSuccessUrl("/login")
//                //ajax인 경우 HTTP 스테이터스를 반환
////                .defaultLogoutSuccessHandlerFor(new HttpStatusReturningLogoutSuccessHandler(), RequestUtil::isAjaxRequest)
//                .invalidateHttpSession(true).permitAll();
//
//        //RememberMe
////        http.rememberMe().key(REMEMBER_ME_KEY)
////                .rememberMeServices(multiDeviceRememberMeServices);
//    }

//    @Bean
//    public AccessDeniedHandler accessDeniedHandler(){
//        return new DefaultAccessDeniedHandler();
//    }
//
//    @Bean
//    public AuthenticationentryPoint authenticationEntryPoint(){
//        return new DefaultAuthenticationEntryPoint("/user/login")
//    }

}
