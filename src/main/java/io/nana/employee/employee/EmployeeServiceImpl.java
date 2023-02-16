package io.nana.employee.employee;
//import  com.microservice.modal.EmployeeModel;
//import com.microservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired private EmployeeRepository empRepo;



    @Override public List<EmployeeModel> getAllEmployee(){
        return empRepo.findAll();
    }
    @Override public void save(EmployeeModel employeeModel){
        empRepo.save(employeeModel);
    }
    @Override public EmployeeModel getById(Long id){
        Optional<EmployeeModel> optional = empRepo.findById(id);
        EmployeeModel employeeModel = null;
        if (optional.isPresent())
            employeeModel = optional.get();
        else
            throw new RuntimeException(
                    "Employee not found for id : " + id);
        return employeeModel;
    }
    @Override public void deleteViaId(long id){
        empRepo.deleteById(id);
    }

}
