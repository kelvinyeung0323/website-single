# 数据库设计

## 用户表

    create table users (
        id  int,
        username varchar(100),
        password varchar(200),
        lastLoginTime datetime,
    );
    
## 登录表