package com.maverick.gshocktracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchService {
    private final WatchRepository repository;

    // Spring injects WatchRepository here
    public WatchService(WatchRepository repository) {
        this.repository = repository;
    }

    public List<Watch> getAll() {
        return repository.findAll();
    }

    public Watch save(Watch watch) {
        return repository.save(watch);
    }

}
