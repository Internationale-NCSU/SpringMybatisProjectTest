package com.example.springmybatisprojecttest.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Songs {
    private Long song_id;
    private String song_title;
    private String duration;
    private String genres;
    private String play_count;
    private String language;
    private Double royalty_rate;
    private String release_date;
    private String release_country;
    private Long album;
}
