package info.example.repository;

import info.example.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository

public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;
    @Autowired
    public  StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public Long insert(Student theStudent) {
        entityManager.persist(theStudent);
        entityManager.flush();
        return theStudent.getId();
    }
}
