/*
{*****************************************************************************
{  电影系统 v1.0													
{  创建人：  xyj
{  审查人：
{  模块：【用户】											
{  功能描述:										
{															
{  ---------------------------------------------------------------------------	
{  维护历史:													
{  日期        维护人        维护类型						
{  ---------------------------------------------------------------------------	
{  2017-03-02  xyj        新建	
{ 	                                                                     
{  ---------------------------------------------------------------------------
{*****************************************************************************
*/

package cn.xyj.unconfigure.service;

import cn.xyj.unconfigure.base.Enum.SqlOrderEnum;
import cn.xyj.unconfigure.dao.IUserDAO;
import cn.xyj.unconfigure.domain.UserEx;
import cn.xyj.unconfigure.param.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 《【用户】》 业务逻辑服务类
 * @author xyj
 *
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDAO userDAO;

     @Override
     public List<UserEx> findAllEx() {
         return userDAO.findAllEx(UserParam.F_ID, SqlOrderEnum.DESC.getAction());
     }



 }