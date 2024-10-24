package com.koreait.exam.springbatch_app_10.app.base.initData;

import com.koreait.exam.springbatch_app_10.app.member.service.MemberService;
import com.koreait.exam.springbatch_app_10.app.member.entity.Member;
import com.koreait.exam.springbatch_app_10.app.product.entity.Product;
import com.koreait.exam.springbatch_app_10.app.product.service.ProductService;
import com.koreait.exam.springbatch_app_10.app.song.entity.Song;
import com.koreait.exam.springbatch_app_10.app.song.service.SongService;

public interface InitDataBefore {
    default void before(MemberService memberService, SongService songService, ProductService productService) {
        Member member1 = memberService.join("user1", "1234", "user1@test.com");
        Member member2 = memberService.join("user2", "1234", "user2@test.com");

        Song song1 = songService.create(member1, "노래 1", "내용 1");
        Song song2 = songService.create(member1, "노래 2", "내용 2");
        Song song3 = songService.create(member2, "노래 3", "내용 3");
        Song song4 = songService.create(member2, "노래 4", "내용 4");
        Song song5 = songService.create(member1, "노래 5", "내용 5");
        Song song6 = songService.create(member1, "노래 6", "내용 6");
        Song song7 = songService.create(member2, "노래 7", "내용 7");
        Song song8 = songService.create(member2, "노래 8", "내용 8");

        Product product1 = productService.create(song1, "상품 1", 1_900);
        productService.create(song3, "상품 2", 2_900);
        productService.create(song5, "상품 3", 3_900);
        productService.create(song7, "상품 4", 4_900);
        productService.create(song8, "상품 5", 5_900);

        productService.modify(product1, "상품 1-1", 3_300);

    }
}
