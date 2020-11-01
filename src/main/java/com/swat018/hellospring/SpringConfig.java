package com.swat018.hellospring;

import com.swat018.hellospring.aop.TimeTraceAop;
import com.swat018.hellospring.repository.*;
import com.swat018.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.lang.reflect.Member;

/**
 * @author jinwoopark
 */
@Configuration
public class SpringConfig {

/*    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

/*    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

/*    @Bean
    public MemberRepository memberRepository() {
 //       return new MemoryMemberRepository();
 //       return new JdbcMemberRepository(dataSource);
 //       return new JdbcTemplateMemberRepository(dataSource);
 //       return new JpaMemberRepository(em);

    }*/

}
