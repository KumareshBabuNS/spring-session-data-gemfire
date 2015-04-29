package org.springframework.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.LocalRegionFactoryBean;
import org.springframework.session.data.gemfire.GemfireSessionRepository;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemfireHttpSession;

import com.gemstone.gemfire.cache.GemFireCache;

@Configuration
@EnableGemfireHttpSession
public class SessionConfig {
	
	@Bean
    CacheFactoryBean cacheFactoryBean() {
        return new CacheFactoryBean();
    }

    @Bean
    LocalRegionFactoryBean<String, GemfireSessionRepository.GemfireSession> localRegionFactory(final GemFireCache cache) {
        return new LocalRegionFactoryBean<String, GemfireSessionRepository.GemfireSession>() {

            {
                setCache(cache);
                setName("spring.session.sessions");
                setClose(false);
            }
        };
    }
}
