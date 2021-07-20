package com.example.api.controller;

import com.example.api.dto.TeamDTO;
import com.example.api.entity.ResultList;
import com.example.api.model.Team;
import com.example.api.service.TeamService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TeamController {

  private final TeamService teamService;

  @GetMapping(path = "/teams")
  @CrossOrigin(origins = "http://localhost:3000")
  public ResponseEntity<ResultList<Team>> getTeams() {
    var teams = teamService.getAllTeams();
    return ResponseEntity.ok(ResultList.<Team>builder().results(teams).build());
  }
}
