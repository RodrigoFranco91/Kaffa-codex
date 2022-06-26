package br.com.rodrigo.restserverclock.controller;

import br.com.rodrigo.restserverclock.client.WorldClockClient;
import br.com.rodrigo.restserverclock.dto.ClockDTO;
import br.com.rodrigo.restserverclock.dto.WorldClockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clock")
public class ClockController {

    @Autowired
    private WorldClockClient worldClockClient;

    @GetMapping
    public ResponseEntity<ClockDTO> getClock(){

        WorldClockDTO worldClockDTO = worldClockClient.consultaHorario();
        ClockDTO response = new ClockDTO(worldClockDTO.getCurrentDateTime());
        return ResponseEntity.ok(response);
    }
}
