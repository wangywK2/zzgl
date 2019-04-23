package com.cn.zzgl.config.system;
/**
 * TODO 包含json结果集
 * @创建时间 2019年4月23日 下午12:36:02
 * @author player
 */
public abstract class BaseController {
	
	
	/**
	 * TODO 成功
	 * @创建时间 2019年4月23日 下午12:40:07
	 * @author fy
	 * @return AjaxResult
	 */
	public AjaxResult success() {
		return this.success(AppStatus.SUCCESS.desc, null);
	}
	public AjaxResult success(String info) {
		return this.success(info,null);
	}
	public AjaxResult success(Object obj) {
		return this.success(null,obj);
	}
	public AjaxResult success(String info,Object obj) {
		return new AjaxResult().success(AppStatus.SUCCESS.status, AppStatus.SUCCESS.code, info, obj);
	}
	
	/**
	 * TODO 失败
	 * @创建时间 2019年4月23日 下午12:42:13
	 * @author fy
	 * @param info
	 * @return AjaxResult
	 */
	public AjaxResult unsuccess(String info) {
		return this.unsuccess(info, null);
	}
	
	public AjaxResult unsuccess(Object msg) {
		return this.unsuccess(null,msg);
	}
	
	public AjaxResult unsuccess(String info,Object msg) {
		return new AjaxResult().error(AppStatus.UNSUCCESSFUL.status, AppStatus.UNSUCCESSFUL.code, info, msg);
	}
	
	/**
	 * TODO 异常
	 * @创建时间 2019年4月23日 下午12:42:57
	 * @author fy
	 * @param info
	 * @return AjaxResult
	 */
	public AjaxResult error(String info) {
		return this.error(info, null);
	}
	
	public AjaxResult error(Object msg) {
		return this.error(null,msg);
	}
	
	public AjaxResult error(String info,Object msg) {
		return new AjaxResult().error(AppStatus.ERROR.status, AppStatus.ERROR.code, info, msg);
	}
}

