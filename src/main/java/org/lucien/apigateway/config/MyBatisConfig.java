//package org.lucien.apigateway.config;
//
//import com.alibaba.druid.pool.DruidDataSourceFactory;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
///**
// * Created by lucien on 2017/5/16.
// */
//@Configuration    //该注解类似于spring配置文件
//@MapperScan(basePackages="org.lucien.apigateway.mapper")
//public class MyBatisConfig {
//
//    //注入了Environment实例，使用该实例可以去读取类路径下application.properties文件中的内容，
//    @Autowired
//    private Environment env;
//
//    //使用druid数据源定义了数据源Bean，
//    // spring-boot默认使用的是tomcat-jdbc数据源，
//    // 这是springboot官方推荐的数据源（性能和并发性都很好）
//    /**
//     * 创建数据源
//     * 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
//     */
//    @Bean
//    public DataSource getDataSource() throws Exception{
//        Properties props = new Properties();
//        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
//        props.put("url", env.getProperty("jdbc.url"));
//        props.put("username", env.getProperty("jdbc.username"));
//        props.put("password", env.getProperty("jdbc.password"));
//        return DruidDataSourceFactory.createDataSource(props);
//    }
//
//    /**
//     * 根据数据源创建SqlSessionFactory
//     * @param ds
//     * @return
//     * @throws Exception
//     */
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
//        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
//        fb.setDataSource(ds);//指定数据源(这个必须有，否则报错)
//        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
//        //指定xml文件位置
//        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));
//        return fb.getObject();
//    }
//
//}
