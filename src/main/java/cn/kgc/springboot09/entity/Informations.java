package cn.kgc.springboot09.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Informations {
   private Integer id;
   private String title;
   private String content;
   private Integer replyCount;
   private Integer viewCount;
   private Date reportTime;
   private Date lastPostTime;
}
