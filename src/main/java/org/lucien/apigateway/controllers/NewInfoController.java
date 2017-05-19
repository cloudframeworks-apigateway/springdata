package org.lucien.apigateway.controllers;

import org.lucien.apigateway.models.NewInfo;
import org.lucien.apigateway.services.INewInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by lucien on 2017/5/17.
 */
@RestController
@RequestMapping("api")
public class NewInfoController {

    @Autowired
    private INewInfoService newInfoService;

    @RequestMapping("/newinfos")
    public List<NewInfo> newInfoList() {
        return newInfoService.selectAllNewInfo();
    }
}
