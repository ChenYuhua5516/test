package com.daji.erpserviceimpl;

import com.daji.mapper.DeptMapper;
import com.daji.pojo.Dept;
import com.daji.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;


    @Override
    public List<Dept> queryAll() {
        return deptMapper.selectAll();
    }


}
