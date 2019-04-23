package com.cn.zzgl.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.zzgl.config.system.BaseController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * TODO
 * @创建时间 2019年4月23日 下午12:52:17
 * @author player
 */
@Controller
@Api("zzgl 测试restful 接口文档")
@CrossOrigin //解决ajax跨域问题
public class TestController extends BaseController{
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	@GetMapping("/say")
	@ResponseBody
	public Object say() {
		logger.info("Hello Word!");
		return "Hello Word!";
	}
	
	@GetMapping("/json")
	@ResponseBody
	public Object josn() {
		return success();
	}
	
	@ApiOperation(value="删除用户", notes="根据url的id来指定删除用户")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	@GetMapping("/rest/{id}")
	public Object restful(@PathVariable(value = "id") long id) {
		return success("restFul接口访问成功。",id);
	}
	
	@GetMapping("/html")
	public String test() {
		logger.info("html页面.");
		return "test";
	}
	
}

