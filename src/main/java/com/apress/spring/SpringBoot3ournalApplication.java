package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot3ournalApplication {

    @Bean
    InitializingBean saveData(JournalRepository journalRepository) {
        return () -> {
            journalRepository.save(new Journal("스프링부트 입문", "오늘부터 스프링부트 시작했다.", "01/01/2016"));
            journalRepository.save(new Journal("간단한 스프링부트 프로젝", "스프링부트 프로젝트 처음 만들어보았다.", "01/02/2016"));
            journalRepository.save(new Journal("스프링부트 해부", "스프링부트 자세히 살펴보았다.", "02/01/2016"));
            journalRepository.save(new Journal("스프링부트 클라우", "클라우드 파운드리를 이용한 스프링부트를 공부해보았다.", "03/01/2016"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3ournalApplication.class, args);
    }

}

