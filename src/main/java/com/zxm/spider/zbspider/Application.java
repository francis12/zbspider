package com.zxm.spider.zbspider;
import com.zxm.spider.mapper.DiyGameVODAO;
import com.zxm.spider.model.DiyGameVO;
import com.zxm.spider.model.DiyGameVOCondition;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@EnableAutoConfiguration
@SpringBootApplication
@WebAppConfiguration
@ComponentScan
@MapperScan("com.zxm.spider.mapper")
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);
    public static Map<String, Object> cache = new HashMap<>();

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }


    /**
     * Start
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        DiyGameVODAO diyGameVODAO = (DiyGameVODAO)context.getBean("diyGameVODAO");

        DiyGameVOCondition condition = new DiyGameVOCondition();
        condition.createCriteria().andBasicidEqualTo(223);
        List<DiyGameVO> list = diyGameVODAO.selectByCondition(condition);

        logger.info("SpringBoot Start Success,list size:" + list.get(0).getHost() );
    }
}
