package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.KejianDao;
import com.entity.KejianEntity;
import com.service.KejianService;
import com.entity.view.KejianView;

/**
 * 学习课件 服务实现类
 * @author 
 * @since 2021-05-03
 */
@Service("kejianService")
@Transactional
public class KejianServiceImpl extends ServiceImpl<KejianDao, KejianEntity> implements KejianService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KejianView> page =new Query<KejianView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
