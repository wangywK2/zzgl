package com.cn.zzgl.config.system;
/**
 * TODO 系统统一访问结果
 * @创建时间 2019年4月23日 下午12:27:35
 * @author player
 */
public enum AppStatus {
	SUCCESS(true,"200","操作成功"),UNSUCCESSFUL(false,"400","操作失败"),ERROR(false,"404","操作异常");
	
	public boolean status;
	public String code;
	public String desc;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private AppStatus(boolean status, String code, String desc) {
		this.status = status;
		this.code = code;
		this.desc = desc;
	}
	
}

