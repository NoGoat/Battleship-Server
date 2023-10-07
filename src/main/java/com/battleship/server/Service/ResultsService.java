package com.battleship.server.Service;

import com.battleship.server.DTO.ResultsDTO;
import org.springframework.stereotype.Service;

@Service
public interface ResultsService
{
    ResultsDTO getById(int id) throws Exception;

    Object save(ResultsDTO resultsDTO);
}
