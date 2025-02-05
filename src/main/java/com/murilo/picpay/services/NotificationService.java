package com.murilo.picpay.services;

import com.murilo.picpay.dtos.NotificationDTO;
import com.murilo.picpay.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

       // ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify",notificationRequest,String.class);
      //if(!(((ResponseEntity<String>) notificationResponse).getStatusCode() == HttpStatus.OK)){
            //System.out.println("Erro ao enviar notificação");
           // throw  new Exception("Serviço notificação esta forra do ar");
       // }

        System.out.println("Notificação enviada para o usuário");
    }
}
