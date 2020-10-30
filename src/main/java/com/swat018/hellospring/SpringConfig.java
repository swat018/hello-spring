package com.swat018.hellospring;

import com.swat018.hellospring.repository.JdbcMemberRepository;
import com.swat018.hellospring.repository.MemberRepository;
import com.swat018.hellospring.repository.MemoryMemberRepository;
import com.swat018.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author jinwoopark
 */
@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
 //       return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
