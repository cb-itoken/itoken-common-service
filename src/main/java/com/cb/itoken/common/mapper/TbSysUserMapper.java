package com.cb.itoken.common.mapper;

import com.cb.itoken.common.domain.TbSysUser;
import com.cb.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbSysUserMapper extends MyMapper<TbSysUser> {
}