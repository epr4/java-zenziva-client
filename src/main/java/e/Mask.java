package e;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;


/**
 * Created by eco on 05/04/2017.
 */
public class Mask {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        Responze responze = restTemplate.getForObject(url, Responze.class);
    }

}
