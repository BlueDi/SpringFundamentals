import com.criticaltechworks.repository.HibernateSpeakerRepositoryImpl;
import com.criticaltechworks.repository.SpeakerRepository;
import com.criticaltechworks.service.SpeakerService;
import com.criticaltechworks.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
