package cn.cms.service;


import cn.cms.po.Achievement;
import cn.cms.po.Page;

import java.util.List;

public interface AchievementService {

    public List<Achievement> getList(Page page);

    public void insert(Achievement record);

    public void delete(int id);

    public void update(Achievement record);

    public long count();
}
