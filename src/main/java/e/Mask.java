package e;

import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


/**
 * Created by eco on 05/04/2017.
 */
public class Mask {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        final String url = "http://alpha.zenziva.net/apps/smsapi.php?userkey=xxx&passkey=xxx&nohp=xxx&pesan=xxx";
        Response response = restTemplate.getForObject(url, Response.class);
        System.out.println("response = " + response);
    }

}
