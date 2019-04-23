package com.cn.zzgl.config.system;

import java.util.HashMap;

/**
 * TODO
 * @创建时间 2019年4月23日 下午12:26:53
 * @author player
 */
public class AjaxResult extends HashMap<String, Object>{
	
	/**
	 * @TODO 
	 * @创建时间 2019年4月23日 下午1:36:00
	 * @author fy
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * TODO 成功
	 * @创建时间 2019年4月23日 下午12:35:26
	 * @author fy
	 * @param bool
	 * @param code
	 * @param info
	 * @param obj
	 * @return AjaxResult
	 */
	public AjaxResult success(boolean bool,String code,String info,Object obj) {
		AjaxResult res = new AjaxResult();
		res.put("success", bool);
		res.put("code", code);
		res.put("info", info);
		res.put("data", obj);
		return res;
	}
	
	/**
	 * TODO 失败
	 * @创建时间 2019年4月23日 下午12:35:41
	 * @author fy
	 * @param bool
	 * @param code
	 * @param info
	 * @param msg
	 * @return AjaxResult
	 */
	public AjaxResult error(boolean bool,String code,String info,Object msg) {
		AjaxResult res = new AjaxResult();
		res.put("success", bool);
		res.put("code", code);
		res.put("info", info);
		res.put("msg", msg);
		return res;
	}
	
	
}

