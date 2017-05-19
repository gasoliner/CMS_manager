package cn.cms.service.impl;

import cn.cms.mapper.AchievementMapper;
import cn.cms.po.Achievement;
import cn.cms.po.AchievementExample;
import cn.cms.po.Page;
import cn.cms.service.AchievementService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class AchievementServiceImpl implements AchievementService {


    @Override
    public List<Achievement> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<Achievement> achievementList = achievementMapper.selectAll(page);
        sqlSession.close();
        return achievementList;
    }

    @Override
    public void insert(Achievement record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
        achievementMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
        achievementMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Achievement record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
        achievementMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
        long count = achievementMapper.countByExample(new AchievementExample());
        sqlSession.close();
        return count;
    }
}
