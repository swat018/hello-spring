package com.swat018.hellospring;

import com.swat018.hellospring.repository.MemberRepository;
import com.swat018.hellospring.repository.MemoryMemberRepository;
import com.swat018.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
