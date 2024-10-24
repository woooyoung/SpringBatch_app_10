package com.koreait.exam.springbatch_app_10.app.base.initData;

import com.koreait.exam.springbatch_app_10.app.member.service.MemberService;
import com.koreait.exam.springbatch_app_10.app.product.service.ProductService;
import com.koreait.exam.springbatch_app_10.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService) {
        return args -> {
            before(memberService, songService, productService);
        };
    }
}
