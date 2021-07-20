package com.example.api.service;

import com.example.api.model.Team;
import com.example.api.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {
  private final TeamRepository teamRepository;

  public List<Team> getAllTeams() {
    var teams = teamRepository.findAll();
    return teamRepository.findAll();
  }
}
