package cn.kgc.springboot09.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Replies {
   private Integer id;
   private String content;
   private Date replyTime;
   private Integer infold;
}
