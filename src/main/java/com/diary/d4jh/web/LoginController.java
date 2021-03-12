package com.diary.d4jh.web;

import com.diary.d4jh.domain.user.User;
import com.diary.d4jh.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
@Slf4j
public class LoginController {

    private final UserService userService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

//    @GetMapping("/")
//    public String main(){
//        return "index";
//    }
    @GetMapping("/user/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/join")
    public String signup(){
        return "join";
    }

    @PostMapping("/join")
    public String join(User user) {
        user.setPwd(passwordEncoder.encode(user.getPwd()));
        userService.save(user);
        return "redirect:/login";
    }

//    @PostMapping("/authenticate")
//    public String loginSuccess(){
//        return "redirect:/index";
//    }
}
