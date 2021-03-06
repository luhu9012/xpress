package com.wuyuncheng.xpress.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyuncheng.xpress.model.dto.UserDTO;
import com.wuyuncheng.xpress.model.entity.User;
import com.wuyuncheng.xpress.model.param.LoginParam;
import com.wuyuncheng.xpress.model.param.UserParam;
import com.wuyuncheng.xpress.model.vo.AuthInfo;

import java.util.List;

public interface AdminService extends IService<User> {

    AuthInfo getToken(LoginParam loginParam);
    void createUser(UserParam userParam);
    List<UserDTO> listUsers();
    void removeUser(Integer userId);
    UserDTO getUser(Integer userId);
    UserDTO getCurrentUser();
    void updateUser(UserParam userParam, Integer userId);

}
