package com.cn.zzgl.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * TODO
 * @创建时间 2019年4月23日 下午12:45:45
 * @author player
 */
public class DateUtl {
	/**
	 * TODO 获取当前本地时间 
	 * @创建时间 2019年4月23日 下午12:47:46
	 * @author fy
	 * @return String yyyy-MM-dd HH:mm:ss
	 */
	public static final String getNowDateTime() {
		return getNowDateTime("yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * TODO 获取当前本地时间 
	 * @创建时间 2019年4月23日 下午12:48:06
	 * @author fy
	 * @param pattern
	 * @return String
	 */
	public static final String getNowDateTime(String pattern) {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
	}
}

