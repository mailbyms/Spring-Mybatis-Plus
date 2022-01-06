package com.gyjian.mybatisplus;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class MybatisPlusGenerator {

    public static void main(String[] args){
        String dbUrl = "jdbc:mysql://192.168.1.70:3307/mia_shop?serverTimezone=Asia/Shanghai";
        String dbUserName = "root";
        String dbUserPassword = "root";
        String projectPath = System.getProperty("user.dir");//当前项目路径

        FastAutoGenerator.create(dbUrl, dbUserName, dbUserPassword)
                .globalConfig(builder -> {
                    builder.author("mybatis-plus") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(projectPath + "\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.gyjian.mybatisplus"); // 设置父包名
                            //.moduleName("system") // 设置父包模块名
                            //.pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user"); // 设置需要生成的表名
                            //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                /*
                .templateConfig(builder -> {
                    builder.disable(TemplateType.CONTROLLER)
                            .disable(TemplateType.SERVICE);
                })
                 */
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
