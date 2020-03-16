import com.criticaltechworks.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
    }
}
