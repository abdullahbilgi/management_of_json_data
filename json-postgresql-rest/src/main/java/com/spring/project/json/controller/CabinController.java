package com.spring.project.json.controller;

import com.spring.project.json.dto.CabinDTO;
import com.spring.project.json.model.Cabin;
import com.spring.project.json.service.CabinService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cabins")
public class CabinController {

    private final CabinService cabinService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<CabinDTO> findAllCabins() {
        return cabinService.findAllCabins();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Optional<CabinDTO> findCabinById(@PathVariable Long id) {
        return cabinService.findByCabinId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CabinDTO createCabin(@Valid @RequestBody CabinDTO cabinDTO) {
        return cabinService.save(cabinDTO);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public CabinDTO updateCabin(@PathVariable Long id,@Valid @RequestBody CabinDTO cabinDTO) {
        return cabinService.update(id,cabinDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteCabin(@PathVariable Long id) {
        cabinService.delete(id);
    }



}
