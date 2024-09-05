package services;

import com.example.model.*;


import java.util.List;

public interface Deptservice  {
    Long addDepartment(DeptObj departmentObj);

    List<DeptObj> getAllDepartments();

    String deleteByDepartment(Long id);

    DeptObj updateDepartment(DeptObj departmentObj, Long id);
}