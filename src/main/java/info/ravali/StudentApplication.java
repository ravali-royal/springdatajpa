package info.ravali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import info.ravali.entity.StudentEntity;
import info.ravali.entity.Repository.StudentRepository;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentApplication.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);
		StudentEntity entity = new StudentEntity();
		entity.setSname("A");
		entity.setSEmail("A@gmail.com");
		entity.setSrank(1);
		StudentEntity save = repository.save(entity);
		System.out.println(save);
	}

}
