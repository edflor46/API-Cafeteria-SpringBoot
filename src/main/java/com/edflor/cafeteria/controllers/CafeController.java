package com.edflor.cafeteria.controllers;

import com.edflor.cafeteria.entity.Cafe;
import com.edflor.cafeteria.services.ICafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CafeController {

    @Autowired
    private ICafeService cafeService;

    @GetMapping("/cafes")
    public List<Cafe> getCafeList() {
        return cafeService.findAll();
    }

    @GetMapping("/cafe/{id}")
    public ResponseEntity<?> getCafeById(@PathVariable Long id) {

        Cafe cafe = null;
        Map<String, Object> response = new HashMap<String, Object>();

        try {
            cafe = cafeService.findById(id);
        } catch (DataAccessException e){
            response.put("mensaje", "Error en la peticion");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        if (cafe == null){
            response.put("mensaje", "El producto con el id: ".concat(id.toString().concat(" no es valido")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Cafe>(cafe, HttpStatus.OK);


    }

}
