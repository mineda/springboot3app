package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Entrega;
import br.gov.sp.fatec.springboot3app.repository.EntregaRepository;

@Service
public class EntregaService implements IEntregaService{

    @Autowired
    private EntregaRepository entregaRepo;

    @Override
    public List<Entrega> buscarDataLimiteSuperior(LocalDateTime limite) {
        return entregaRepo.findByDataHoraLimiteGreaterThan(limite);
    }

    @Override
    public List<Entrega> buscarTodas() {
        return entregaRepo.findAll();
    }
    
}
