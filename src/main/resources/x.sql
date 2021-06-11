create database sb09;
use sb09;
create table t_informations(
    id int primary key auto_increment,
    title varchar(500) not null comment '咨询标题',
    content varchar(500) not null comment '咨询内容',
    replyCount int not null comment '回复次数',
    viewCount int not null comment '查看次数',
    reportTime date not null comment '发表时间',
    lastPostTime date not null comment '最后回复时间'
);
create table t_replies(
    id int primary key auto_increment,
    content varchar(500) not null comment '回复内容',
    replyTime date not null comment '回复时间',
    infold int not null comment '咨询id',
                      foreign key (infold) references t_informations(id)
)



