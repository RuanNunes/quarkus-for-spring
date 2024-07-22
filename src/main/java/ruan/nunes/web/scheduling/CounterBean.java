package ruan.nunes.web.scheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.atomic.AtomicInteger;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CounterBean {

    private AtomicInteger counter = new AtomicInteger();

    public int get() {
        return counter.get();
    }

//    @Scheduled(cron="*/5 * * * * ?") // tarefa para ser executada às 10:15 da manhã todos os dias.
//    void cronJob() {
//        counter.incrementAndGet();
//        System.out.println("Cron expression hardcoded");
//    }
//
//    @Scheduled(cron = "{cron.expr}") // usa env do arquivo application.properties
//    void cronJobWithExpressionInConfig() {
//        counter.incrementAndGet();
//        System.out.println("Cron expression configured in application.properties");
//    }
//
//    @Scheduled(fixedRate = 1000) // tarefa para ser executada a cada 1 segundo.
//    void jobAtFixedRate() {
//        counter.incrementAndGet();
//        System.out.println("Fixed Rate expression");
//    }
//
//    @Scheduled(fixedRateString = "${fixedRate.expr}") // usa env do arquivo application.properties
//    void jobAtFixedRateInConfig() {
//        counter.incrementAndGet();
//        System.out.println("Fixed Rate expression configured in application.properties");
//    }
}
