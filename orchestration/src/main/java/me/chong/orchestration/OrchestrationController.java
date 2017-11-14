package me.chong.orchestration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.chong.orchestration.to.ApplicationTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/apps")
public class OrchestrationController {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private ArrayList<ApplicationTO> applications;

    @GetMapping("/status")
    public String getStatus(String param) {

        JavaType javaType = getCollectionType(ArrayList.class, ApplicationTO.class);

        try {
            applications = objectMapper.readValue(param, javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!applications.isEmpty()) {
            for (ApplicationTO application : applications) {
                String serviceName =  application.getServiceName();
                String status = application.getStatus();
                System.out.println("service is " + serviceName + ", status is " + status);
                application.setStatus("ALIVE");
            }
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String result = null;
        try {
            result = objectMapper.writeValueAsString(applications);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(result);

        return result;
    }

    public JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
