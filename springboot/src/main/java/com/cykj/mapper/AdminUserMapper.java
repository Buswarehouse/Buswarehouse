package com.cykj.mapper;

import com.cykj.entity.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserMapper {

    public AdminUser selectUser(AdminUser adminUser);
}
