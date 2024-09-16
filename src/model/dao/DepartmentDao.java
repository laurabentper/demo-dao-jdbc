package model.dao;

import model.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department object);
    void update(Department object);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
