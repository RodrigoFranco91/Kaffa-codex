package br.com.rodrigo.restserverclock.client;

import br.com.rodrigo.restserverclock.dto.WorldClockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "WorldClockClient", url = "http://worldclockapi.com")
public interface WorldClockClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/json/utc/now")
    public WorldClockDTO consultaHorario();
}