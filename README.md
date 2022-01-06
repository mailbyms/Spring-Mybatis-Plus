# Spring-Mybatis-Plus Demo
参考：[mybatis plus 看这篇就够了，一发入魂](https://juejin.cn/post/6961721367846715428)

## 创建过程
- 部署一个 MySQL 服务器，创建一个库和一张表（结构不限）
- 使用 spring initializer 创建一个 SpringBoot web 项目
- 在 pom.xml 加入如下依赖，第2和第3个依赖是 代码自动生成器相关
    ```yaml
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.2</version>
        </dependency>

        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-generator</artifactId>
            <version>3.5.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.velocity</groupId>
            <artifactId>velocity-engine-core</artifactId>
            <version>2.0</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
    ```
- 项目的配置文件增加 mysql 的连接配置
  ```yaml
  # application.yml
  spring:
    datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://192.168.1.70:3307/mia_shop?serverTimezone=Asia/Shanghai
      username: root
      password: root
    
  mybatis-plus:
    configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl #开启SQL语句打印
  ```
- 项目启动类增加注解 `@MapperScan("com.gyjian.mybatisplus.mapper")`，注意 package 不要写错 
- 增加代码生成器 `MybatisPlusGenerator`（暂放在 test 下），
  - 代码参考官方说明：<https://baomidou.com/pages/779a6e/> 
  - 可以配置的项见官方说明：<https://baomidou.com/pages/981406/>
  - 注意 `builder.parent()`，生成代码的输出目录
  - 运行后会生成 controller, service, mapper（包括 xml 文件）和 entity 
- 增加 UserTest 单元测试
    
