package io.nana.employee.employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeModel> getAllEmployee();
    void save(EmployeeModel employee);
    EmployeeModel getById(Long id);
    void deleteViaId(long id);
}
