package com.kuang.dao;

import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ArticleMapperTest {


    @Test
    public void test(){
       SqlSession sqlSession= MybatisUtils.getSqlSession();
       IArticleMapper articleMapper= sqlSession.getMapper(IArticleMapper.class);
       System.out.println(articleMapper.getList());
       sqlSession.close();
    }
}
