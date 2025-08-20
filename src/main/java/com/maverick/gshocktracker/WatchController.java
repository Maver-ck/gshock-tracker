package com.maverick.gshocktracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/watches")
public class WatchController {
    private final WatchService service;

    public WatchController(WatchService service) {
        this.service = service;
    }

    @GetMapping
    public List<Watch> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Watch create(@RequestBody Watch watch) {
        return service.save(watch);
    }


}
