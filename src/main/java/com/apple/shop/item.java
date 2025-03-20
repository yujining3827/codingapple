package com.apple.shop;

import jakarta.persistence.*;

@Entity
public class item {
    @Id //id 컬럼엔 꼭 @해줘야함
            @GeneratedValue(strategy = GenerationType.IDENTITY) //알아서 1씩 증가시켜줌
    public Long id;
    public String title;
    public Integer price; // int/integer : +- 20억까지 저장 가능, long/Long : 900경까지 저장 가능
}

