import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello! This is a demo application linked to this tutorial: http://jkutner.github.io/2016/08/18/android-backend-api-heroku-retrofit.html";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {


        try {
            String url="postgres://gwqtuklslbqyma:f4b13ecb57f43e3c7975d35b2ffef083bc540c51f7588231bf46c469ee842c2d@ec2-54-225-89-195.compute-1.amazonaws.com:5432/dfeqp6q4u62jdp";
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            return "Error aa Gayi";
            System.out.println(e.getMessage());
        }

        return "Connected Hello from Heroku!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
