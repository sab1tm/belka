package kz.sab1tm.belka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelkaApplication {

    public static void main(String[] args) {
        System.out.println("Environment Variable envvar1 is:" + System.getenv("envvar1"));
        System.out.println("System property sysprop1 is:" + System.getProperty("sysprop1"));

        if (args != null && args.length > 0) {
            System.out.println("Command line arguments are: ");
            for (String arg : args)
                System.out.println(arg);
        }

        SpringApplication.run(BelkaApplication.class, args);
    }

}
