package com.hotel.reservahabitaciones.Controller;

import com.hotel.reservahabitaciones.Model.DTOs.PermisoDTO;
import com.hotel.reservahabitaciones.Model.Entities.Habitacion;
import com.hotel.reservahabitaciones.Service.Impl.PermisoServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel/permisos")
public class PermisoController {

    @Autowired
    PermisoServiceImpl permisoService;

    @GetMapping
    public ResponseEntity<List<PermisoDTO>>getAll(){
        return new ResponseEntity<>(permisoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<PermisoDTO>getById(@PathVariable Long id){
        return new ResponseEntity<>(permisoService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/buscar-por-nombre/{nombre}")
    public ResponseEntity<PermisoDTO>getByName(@PathVariable String nombre){
        return new ResponseEntity<>(permisoService.getByNombre(nombre),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?>save(@RequestBody PermisoDTO permisoDTO){
        permisoService.save(permisoDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public  ResponseEntity<PermisoDTO>update(@PathVariable Long id,@RequestBody PermisoDTO permisoDTO){
        return new ResponseEntity<>(permisoService.update(id,permisoDTO),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable Long id){
        permisoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
