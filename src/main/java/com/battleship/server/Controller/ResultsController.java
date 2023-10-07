package com.battleship.server.Controller;

import com.battleship.server.DTO.ResultsDTO;
import com.battleship.server.Service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/results")
public class ResultsController
{
    @Autowired
    private ResultsService resultsService;

    @PostMapping
    public Object saveUser(@RequestBody ResultsDTO resultsDTO)
    {
        return resultsService.save(resultsDTO);
    }

    @GetMapping("/{id}")
    private Object getUser(@PathVariable("id") int id)
    {
        try
        {
            return resultsService.getById(id);
        }
        catch (Exception ex)
        {
            return ex;
        }
    }
}
