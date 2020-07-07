package com.github.alenfive.rocketapi.entity.vo;

import lombok.Data;

/**
 * @Description: 组名修改入参
 * @Copyright: Copyright (c) 2019  ALL RIGHTS RESERVED.
 * @Author: 米华军
 * @CreateDate: 2020/6/11 17:44
 * @UpdateDate: 2020/6/11 17:44
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Data
public class RenameGroupReq {
    private String newGroup;
    private String oldGroup;
}