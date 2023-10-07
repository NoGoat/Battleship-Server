package com.battleship.server.Service;

import com.battleship.server.DTO.ResultsDTO;
import com.battleship.server.Entity.Results;
import com.battleship.server.Repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsServiceIMPL implements ResultsService
{
    @Autowired
    ResultsRepository resultsRepository;

    @Override
    public ResultsDTO getById(int id) throws Exception
    {
        if(resultsRepository.existsById(id))
        {
            Results results = resultsRepository.getReferenceById(id);
            ResultsDTO resultsDTO = new ResultsDTO();
            resultsDTO.setLoser(results.getLoser());
            resultsDTO.setWinner(results.getWinner());
            resultsDTO.setTime(results.getTime());
            resultsDTO.setMatch_id(results.getMatch_id());
            return resultsDTO;
        }
        else
        {
            throw new Exception("Data not found");
        }
    }

    @Override
    public Object save(ResultsDTO resultsDTO)
    {
        try
        {
            Results results = new Results();
            results.setTime(resultsDTO.getTime());
            results.setWinner(resultsDTO.getWinner());
            results.setLoser(resultsDTO.getLoser());
            results.setMatch_id(resultsDTO.getMatch_id());
            resultsRepository.save(results);
            return results;
        }
        catch (Exception ex)
        {
            return ex;
        }
    }
}
