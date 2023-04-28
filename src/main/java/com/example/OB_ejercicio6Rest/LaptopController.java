package com.example.OB_ejercicio6Rest;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository repository) {
        this.laptopRepository = repository;
    }
    /**
     *Method findAll()
     */
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    /**
     * Method findOneById()
     */
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> bookOpt = laptopRepository.findById(id);
        if (bookOpt.isPresent()){
            return ResponseEntity.ok(bookOpt.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * method Create()
     * @param laptop
     * @return
     */
    @PostMapping("/api/laptops")
    public Laptop crear(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

    /**
     * method update()
     */

    @PutMapping("api/laptops")
    public ResponseEntity<Laptop> update (@RequestBody Laptop laptop){
        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }

    /**
     * methos deleteById
     */
    @DeleteMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> deleteById(@PathVariable Long id){
        laptopRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    /**
     * method DeleteAll
     */
    @DeleteMapping("api/laptops")
    public ResponseEntity<Laptop> DeleteAll(){
        laptopRepository.deleteAll();
        return ResponseEntity.ok().build();
    }

}
