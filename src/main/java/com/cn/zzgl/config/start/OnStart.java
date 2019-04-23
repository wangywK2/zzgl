package com.cn.zzgl.config.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * TODO 项目启动后执行，加载缓存等
 * @创建时间 2019年4月23日 下午12:59:48
 * @author player
 */
@Configuration
public class OnStart implements ApplicationListener<ContextRefreshedEvent>{
	private Logger logger = LoggerFactory.getLogger(OnStart.class);
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.info("项目启动成功... ...");
	}

}

