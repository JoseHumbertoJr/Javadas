package br.com.devdojo.awesome.endpoint;


import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.awesome.model.Student;
import static java.util.Arrays.asList;

@RestController
@ResponseBody
@RequestMapping("student")
public class StudentEndPoint {
	@RequestMapping(method = RequestMethod.GET.PATCH)
	public List<Student> listAll(){
		return asList(new Student("goku"),new Student("pocin"));
	}
}
