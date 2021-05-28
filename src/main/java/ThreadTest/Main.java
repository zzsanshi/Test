package ThreadTest;

import ThreadTest.Service.AsyncTaskService;
import ThreadTest.taskexecutor.TaskExecutorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }
}
