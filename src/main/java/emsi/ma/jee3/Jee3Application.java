package emsi.ma.jee3;

import emsi.ma.jee3.dao.enitities.Pc;
import emsi.ma.jee3.dao.enitities.repository.PcRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Jee3Application {

    public static void main(String[] args) {
        SpringApplication.run(Jee3Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    CommandLineRunner initializeData(PcRepository pcRepository) {
        return args -> {
            Pc pc1 = new Pc("Intel i5", 8, 256, 7000.0, "00:0a:95:9d:68:16");
            Pc pc2 = new Pc("Intel i7", 16, 512, 12000.0, "00:0a:95:9d:68:17");
            Pc pc3 = new Pc("AMD Ryzen 5", 16, 1024, 9000.0, "00:0a:95:9d:68:18");
            Pc pc4 = new Pc("Intel i9", 32, 2048, 20000.0, "00:0a:95:9d:68:19");
            pcRepository.save(pc1);
            pcRepository.save(pc2);
            pcRepository.save(pc3);
            pcRepository.save(pc4);

            System.out.println("4 PCs have been inserted successfully!");
        };
    }

}
