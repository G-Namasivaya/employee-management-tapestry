package com.example.employeeapp.dao;

import com.example.employeeapp.entities.Employee;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> getEmployeeData() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
        return criteria.list();
    }

    @Override
  public Employee getById(Long id) {
    Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
    criteria.add(Restrictions.idEq(id));
    return (Employee) criteria.uniqueResult();
}   
}
