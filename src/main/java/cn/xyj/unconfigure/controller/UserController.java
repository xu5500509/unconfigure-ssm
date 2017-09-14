package cn.xyj.unconfigure.controller;

import cn.xyj.unconfigure.domain.UserEx;
import cn.xyj.unconfigure.service.IUserService;
import cn.xyj.unconfigure.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 后台用户controller
 */
@Controller
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll() throws Exception {
        boolean isSuc = false;
        List<UserEx> data  =  new ArrayList<>();
        try {
            data = userService.findAllEx();
            isSuc = true;
            //int a = 1/0;
        } catch (Exception e) {
            throw new Exception(e);
        }
        return CommonUtil.wrapData(data, CommonUtil.QUERY, isSuc);
    }

}
