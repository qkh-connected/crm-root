package com.sm.cn.controller;

import com.sm.cn.controller.base.BaseController;
import com.sm.cn.entity.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category,Long> {
}
